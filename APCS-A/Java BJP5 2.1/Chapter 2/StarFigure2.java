/*
Modify your StarFigure code from the previous problem to use a constant for the size.
The outputs below use a constant size of 3 (left) and 6 (right):

size 3

////////\\\\\\\\
////********\\\\
****************


size 6

////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************

*/
public class StarFigure2 {

    public static final int theOnlyConstantIHave = 3; // define our only constant

    public static void main(String[] args) {
        for (int i = 1; i <= theOnlyConstantIHave; i++) { // Loop depending on what our constant is

            for (int a = 1; a <= (4 * theOnlyConstantIHave) - 4 * i; a++) { // multiply our formula with the constant
                System.out.print("/");
            }

            for (int a = 1; a <= 8 * i - 8; a++) { // print out the * depending on iso not when i is 1
                System.out.print("*");
            }

            for (int a = 1; a <= (4 * theOnlyConstantIHave) - 4 * i; a++) { // same loop for / only this time for \
                System.out.print("\\");
            }

            System.out.println(); // seperate line
        }
    }
}
