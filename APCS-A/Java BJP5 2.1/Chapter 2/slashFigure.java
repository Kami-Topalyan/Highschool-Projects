/*


Write a Java program in a class named SlashFigure that produces the 
following output. Use nested for loops to capture the structure of the figure. 
(If you previously solved Self-Check problems 34 and 35 in the book, 
you will have created a loop table that will be useful in solving this problem. Use it!)

!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////


*/

public class slashFigure {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) { // A loop to create 6 lines
            for (int b = 0; b < 2 * i - 2; b++) { // Loop to print out the \ if i is not the 1
                System.out.print("\\");
            }

            for (int a = 0; a < -4 * i + 26; a++) { // Loop to create the ! marks which decreased each time i is
                                                    // increased
                System.out.print("!");
            }
            for (int a = 0; a < 2 * i - 2; a++) { // Loop to finish out the / after exclamation marks finished printed
                                                  // out same method as loop for \
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
