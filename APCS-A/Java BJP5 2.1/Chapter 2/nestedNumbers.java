/* 
Write nested for loops that produce the following output:

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999 
*/

public class nestedNumbers {
    public static void main(String[] args) {
        for (int b = 0; b < 3; b++) { // A for loop that repeats 3 times
            for (int i = 0; i < 10; i++) { // A loop to create a line and one that we use to decide which number we are
                                           // on to print a set number of that number
                for (int a = 0; a < 3; a++) // print a number 3 times
                    System.out.print(i); // prints the numbre i is on
            }
            System.out.println();
        }
    }
}
