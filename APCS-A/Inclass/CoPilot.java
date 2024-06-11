import java.util.Scanner;


public class CoPilot {
    public static void main(String[] args) {
        //Initlize our varibles
        double total = 0;
        boolean containsDigit = false;
        int i = 0;

        try (Scanner sc = new Scanner(System.in)) { // Catch an error for the case that the given input is able to cause an error
            System.out.println("Enter operation");

            String text = sc.nextLine(); // Take text input to operate on

            String clean = text.replaceAll("\\D+", ""); // isolate the number inside the text

            if (text != null && !text.isEmpty()) { // used to check if the string has a numeric char in the text 
                for (int a = 0; a < text.length(); a++) {
                    if (Character.isDigit(text.charAt(a))) {
                        containsDigit = true;
                    }
                }
            }

            if (containsDigit == false) { // if no numeric chars are found then convert word into number
                // Checking if text has a number in a form of words
                if (text.contains("one")) {
                    i = 1;
                } else if (text.contains("two")) {
                    i = 2;
                } else if (text.contains("three")) {
                    i = 3;
                } else if (text.contains("four")) {
                    i = 4;
                } else if (text.contains("five")) {
                    i = 5;
                } else if (i == 0) { // if none match print an error and do a recursion back to the main method
                    System.out.println(
                            "Error, the number of operations must be less than or equal to five and more than zero try again");
                    main(args);
                }
            }

            if (containsDigit == true) { // if a numeric digit is found then parse it into an int by using the isolated string
                i = Integer.parseInt(clean);
            }

            if (!(i > 0) || !(i <= 5)) { // do a check to see if the int is bigger than 0 and less than or equal to 5
                System.out.println(
                        "Error, the number of operations must be less than or equal to 5 and more than 0 try again");
                main(args);
            }

            System.out.println("Enter numbers");
            for (int inter = 0; inter < i; inter++) { // do a for-loop to do the math
               double number = sc.nextDouble(); // get new input from the user
                if (text.contains("add")) {
                    total += number; // do math based on what operation was wanted
                } else if (text.contains("subtract")) { 
                    if (inter == 0) { // if this is the first loop repeat the loop after setting the total to the first input 
                        total = number;
                        continue;
                    }
                    total -= number; // do math based on what operation was wanted
                } else if (text.contains("multiply")) { 
                    if (inter == 0) { // if this is the first loop repeat the loop after setting the total to the first input 
                        total = number;
                        continue;
                    }
                    total *= number; // do math based on what operation was wanted
                } else if (text.contains("divide")) { 
                    if (inter == 0) { // if this is the first loop repeat the loop after setting the total to the first input 
                        total = number;
                        continue;
                    }
                    total /= number; // do math based on what operation was wanted
                } else { // print out an error if operation does not match and do a recursion back to the main method
                    System.out.println("Operation not found please try again");
                    main(args);
                }
            }
            System.out.println(total); // print total

        } catch (NumberFormatException e) { // if error is found print it out and do a recursion back to the main method
            System.out.println(e);
            main(args);
        }
    }
}
