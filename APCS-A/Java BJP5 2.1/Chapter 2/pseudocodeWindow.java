/*

Write a pseudocode algorithm that will produce the following figure as output:

+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+

*/
public class pseudocodeWindow {
    public static void main(String[] args) {
        for (int b = 0; b < 2; b++) { // print lines
            for (int i = 0; i < 2; i++) { // create the seperators

                System.out.print("+");
                for (int a = 0; a < 3; a++) {
                    System.out.print("=");
                }

            }
            System.out.println("+");
            for (int c = 0; c < 3; c++) { // print the | | | per line
                System.out.println("|   |   |");
            }
        }
        for (int i = 0; i < 2; i++) { // the seperators again
            System.out.print("+");
            for (int d = 0; d < 3; d++) {
                System.out.print("=");
            }
        }
        System.out.println("+"); // finish off with a +
    }
}