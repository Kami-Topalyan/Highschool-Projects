public class CoinSorter {
    public static void main(String[] args)  {
        Coin penny = new Coin(0.01, 5, "Penny");
        penny.Output();
        Coin nickel = new Coin(0.05, 6, "Nickel");
        nickel.Output();
        Coin dime = new Coin(0.1, 7, "Dime");
        dime.Output();
        Coin quarter = new Coin(0.25, 2, "Quarter");
        quarter.Output();
        System.out.println();
        double temparr = 0;    

        double pennyValue = penny.Get_Value() *  penny.Get_Count();
        double nickelValue = nickel.Get_Value() * nickel.Get_Count();
        double dimeValue = dime.Get_Value() * dime.Get_Count();
        double quarterValue = quarter.Get_Value() * quarter.Get_Count();
        double[] arr = new double[] {pennyValue, nickelValue, dimeValue, quarterValue};    

        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temparr = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temparr;    
               }     
            }     
        }    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }

}
class Coin {
    private double value;
    private double count;
    private String name;
  
    public Coin(double val, double cou, String nam){
      value = val; count = cou; name = nam;
    }
    public void Output() {
        System.out.println("Value: "+value);
        System.out.println("Count: "+count);
        System.out.println("Name: "+name);
        System.out.println();
      }
      public double Get_Value() {
        return value;
      }

      public double Get_Count() {
        return count;
      }
    }