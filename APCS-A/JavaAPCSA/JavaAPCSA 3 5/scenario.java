import java.util.Scanner;
import javax.swing.JOptionPane;

public class scenario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner file = new Scanner(scenario.class.getResourceAsStream("File.txt"));

        System.out.println("Do you want to take input from gui or file (gui, file)");
        String answer = sc.nextLine();
        while (answer.equals("gui") || answer.equals("file")) {
            if (answer.equals("file")) {
                String entireLine = file.nextLine();
                System.out.println("Hello, " + entireLine);
            } else {
                String inputString = (String)JOptionPane.showInputDialog(null,
                                                                        "Enter Name: ",
                                                                        "Hello Machine",
                                                                        2,
                                                                        null,
                                                                        null,
                                                                        "");
                System.out.println("Hello, " + inputString);
            }
            System.exit(0);
            sc.close();
        }
        System.out.println("Error! check input");
        main(args);
    }
}
