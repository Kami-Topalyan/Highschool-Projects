
/*
Modify your DollarFigure program to become a new program called 
DollarFigure2 that uses a global constant for the figure's height.

Size 3

$$$******$$$
**$$****$$**
****$**$****


Size 5

$$$$$**********$$$$$
**$$$$********$$$$**
****$$$******$$$****
******$$****$$******
********$**$********
*/

public class DollarFigure2 {
   public static final int theOnlyConstantIHave = 5; //define constant

   public static void main(String[] args) {
      for (int i = 0; i < theOnlyConstantIHave; i++) { //print lines depending on the constant

         for (int a = 1; a <= 2 * i; a++) { // create the first * if i is at one never don't print
            System.out.print("*");
         }

         for (int a = 1; a <= theOnlyConstantIHave - i; a++) { // print out the $ which gets less each time loop repeats
            System.out.print("$");
         }

         for (int a = 1; a <= 2 * theOnlyConstantIHave - 2 * i; a++) { // a method of ignoreing palcement at start for *
            System.out.print("*");
         }

         for (int a = 1; a <= theOnlyConstantIHave - i; a++) { // print out the right side for $
            System.out.print("$");
         }

         for (int a = 1; a <= 2 * i; a++) { // print out the * with the same algorithm from before
            System.out.print("*");
         }

         System.out.println(); // line break
      }
   }
}