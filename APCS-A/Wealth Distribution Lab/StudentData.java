import java.util.*;
import java.io.*;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StudentData {
  
  private ArrayList<String> unformattedData;
  private String[][] formattedData;
  private String[][] data;
  private File fileName;
  private String entry;
  private String altEntry;
  private int rowLength;
  private int colLength = 14;
  private boolean colLenSet;
  private int cnt;

  public static void main(String[] args) throws IOException {
    StudentData d = new StudentData("dataset.csv");

    boolean quit = false;
    int year = 0;
    String name = "";
    int row = 0;
    int pop = 0;

    Scanner inputReader = new Scanner(System.in);
    while(quit == false) {
      try {
        System.out.println("Which country would you like to know the Gini index of (type q to quit)? ");
        name = inputReader.nextLine();
        System.out.println("Which year?");
        year = inputReader.nextInt();
        if(name.equals("q")) {System.exit(0);}
        row = d.getRow(name, year);
        pop = Integer.parseInt(d.getFormattedData()[row][13].strip());
        CountryData data = new CountryData(name, year, pop, d.getInc(name, year));
        System.out.println(data.giniIndex());
      } catch (Exception ex){
        System.out.println("Not in database");
      }

    }
  }
  
  public StudentData(String file) throws IOException {
    try {
      fileName = new File(file); //opens the file to read

      Scanner MainScan = new Scanner(fileName); //instantiates a Scanner object that will read the file
      Scanner altScan = new Scanner(fileName); //instantiates a Scanner object that will read the file
      /* Initialize the ArrayList and read through the file, populating the  */
      unformattedData = new ArrayList<String>();

      MainScan.useDelimiter(",|\\n");
      altScan.useDelimiter(",");
      while (MainScan.hasNext()) {
        entry = MainScan.next();
        if(colLenSet == false) {
          altEntry = altScan.next();
        }
        unformattedData.add(entry.replaceAll("\"", ""));
        if(altEntry.contains("\n") && colLenSet == false){
          colLength = unformattedData.size();
          colLenSet = true;
        }
      }

      formattedData = getFormattedData();
      Path path = Paths.get(file);
      rowLength = (int) Files.lines(path).count();
      formattedData = new String[rowLength][colLength];

      MainScan.close();
      altScan.close();

      
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
  
  public String[][] getFormattedData() {
    for(int row = 0; row<rowLength;row++) {
      for(int col = 0; col<colLength; col++) {
          formattedData[row][col] = unformattedData.get(cnt++);
      }
    }
    cnt = 0;
    return formattedData;
  }

  
  
  /* Returns the row containing the country and year. Returns -1 if not found. */
  public int getRow(String countryName, int year) {
    for(int row = 0; row<rowLength;row++) {
        if(getFormattedData()[row][0].equals(countryName) && getFormattedData()[row][1].equals(Integer.toString(year))) {
          return row;
        } 
      }
    return -1;
  }

public int[] getInc(String countryName, int year) {
  int index = getRow(countryName, year);
  int[] totalInc = new int[10];
  for(int i = 2; i<12; i++) {
    totalInc[i - 2] = Integer.parseInt(formattedData[index][i]); 
  }
  return totalInc;
}
}
  
class CountryData {
  private String name;
  private int year;
  private int population;
  private int[] incomeDeciles;

  public CountryData(String n, int y, int pop, int[] inc) {
    name = n;
    year = y;
    population = pop;
    incomeDeciles = inc;
  }

  public int totalIncome() {
    int sum = 0;

    for(int i=0; i<incomeDeciles.length; i++){
      sum += incomeDeciles[i];
   }
   return sum;
  }

  public double giniIndex() {
    double gini = 0;
    gini = (1 - (0.1/totalIncome() * ((incomeDeciles[0]+ 2*(incomeDeciles[0] + incomeDeciles[1]) + 2*(incomeDeciles[0] + incomeDeciles[1] + incomeDeciles[2]) + 2*(incomeDeciles[0] + incomeDeciles[1] + incomeDeciles[2] +incomeDeciles[3]) + 2*(incomeDeciles[0] + incomeDeciles[1] + incomeDeciles[2] +incomeDeciles[3] +incomeDeciles[4]) + 2*(incomeDeciles[0] + incomeDeciles[1] + incomeDeciles[2] +incomeDeciles[3] +incomeDeciles[4]+incomeDeciles[5]) + 2*(incomeDeciles[0] + incomeDeciles[1] + incomeDeciles[2] +incomeDeciles[3] +incomeDeciles[4] + incomeDeciles[5] + incomeDeciles[6]) + 2*(incomeDeciles[0] + incomeDeciles[1] + incomeDeciles[2] +incomeDeciles[3] +incomeDeciles[4] + incomeDeciles[5] + incomeDeciles[6] + incomeDeciles[7]) + 2*(incomeDeciles[0] + incomeDeciles[1] + incomeDeciles[2] +incomeDeciles[3] +incomeDeciles[4] + incomeDeciles[5] + incomeDeciles[6] + incomeDeciles[7] + incomeDeciles[8])+ (incomeDeciles[0] + incomeDeciles[1] + incomeDeciles[2] +incomeDeciles[3] +incomeDeciles[4] + incomeDeciles[5] + incomeDeciles[6] + incomeDeciles[7] + incomeDeciles[8] + incomeDeciles[9])))));
    return gini;
    }
  }
