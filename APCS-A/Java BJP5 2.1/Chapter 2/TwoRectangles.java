/*
Write a program called TwoRectangles that uses two integer class constants called WIDTH and HEIGHT to draw two rectangles of stars of the given dimensions.
The first rectangle should be flush left, and the second should be indented horizontally by the given width.
For example, if the WIDTH and HEIGHT are 7 and 4 respectively, the program should draw the following figure:

*******
*******
*******
*******
       *******
       *******
       *******
       *******
*/
public class TwoRectangles {
    public static void main(String[] args) {
        int WIDTH = 7; // define the constants
        int HEIGHT = 4;

        for (int i = 1; i <= HEIGHT; i++) { // creates lines depending on what is height
            for (int a = 1; a <= WIDTH; a++) { // create a line depending on what is width
                System.out.print("*");
            }
            System.out.println(); // line break
        }
        for (int i = 1; i <= HEIGHT; i++) { // creates lines depending on what is height
            for (int a = 1; a <= WIDTH; a++) { // create empthy spaces before printing out the next square witht he same
                                               // algorithm to the first loop
                System.out.print(" ");
            }
            for (int a = 1; a <= WIDTH; a++) { // same thing for printing sqaure 2
                System.out.print("*");
            }
            System.out.println(); // line break
        }
    }
}
