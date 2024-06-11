/*
Write a Java program in a class named Window that produces the preceding figure as output.
Use nested for loops to print the repeated parts of the figure.
Once you get it to work, add one class constant to your program so that the size of the figure can
be changed simply by changing that constant's value. The example output shown is at a constant size of 3, but if you
change the constant, the figure should grow larger and wider proportionally.

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
public class Window {

    public static final int theOnlyConstantIHave = 3; // Define our only constant

    public static void line() { // function for createting the sperators that have + and =
        System.out.print("+");

        for (int i = 0; i < theOnlyConstantIHave; i++) // print out = depending on what our consant is
            System.out.print("=");

        System.out.print("+"); // add a + between the equals

        for (int i = 0; i < theOnlyConstantIHave; i++) // same thing as the first one
            System.out.print("=");

        System.out.print("+");
    }

    public static void window() {
        for (int i = 0; i < theOnlyConstantIHave; i++) { // a method to rpint out | | | with the ammount our constant is
            System.out.print("|");
            System.out.print(" ".repeat(3));
            System.out.print("|");
            System.out.print(" ".repeat(3));
            System.out.println("|");
        }

    }

    public static void main(String[] args) { // running our functions
        Window.line();
        System.out.println();
        Window.window();
        Window.line();
        System.out.println();
        Window.window();
        Window.line();
    }

}
