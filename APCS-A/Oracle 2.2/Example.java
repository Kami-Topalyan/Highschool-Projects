import java.util.Scanner;

public class Example {
    public double Addition(double num1, double num2) {
        return num1 + num2;
    }

    public double Subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double Multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double Divison(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Example operations = new Example();

            System.out.println();
            System.out.println("Enter num1");
            String num1 = scan.nextLine();
            System.out.println();
            System.out.println("Enter num2");
            String num2 = scan.nextLine();
            System.out.println();
            System.out.println("Enter operation (add, subtract, multiply, divide)");
            String operation = scan.nextLine();
            System.out.println();

            try {
                if (operation.equals("add") == true) {
                    System.out.println(operations.Addition(Double.parseDouble(num1), Double.parseDouble(num2)));
                }

                else if (operation.equals("subtract") == true) {
                    System.out.println(operations.Subtraction(Double.parseDouble(num1), Double.parseDouble(num2)));
                }

                else if (operation.equals("multiply") == true) {
                    System.out.println(operations.Multiplication(Double.parseDouble(num1), Double.parseDouble(num2)));
                }

                else if (operation.equals("divide") == true) {
                    System.out.println(operations.Divison(Double.parseDouble(num1), Double.parseDouble(num2)));
                }

                else {
                    System.out.println("Wrong operation try any of add, subtract, multiply, divide");

                }
            } catch (Exception e) {
                System.out.println("Something went wrong maybe a wrong number was entered or 0 / 0 was used");
                Example.main(args);
            }
        }
    }
}
