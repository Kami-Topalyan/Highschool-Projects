public class numbersOutputConstant {
    public static void main(String[] args)  {
        String str = args[0];
        int index = str.indexOf("0");
        for (int i = 1; i <= 6; i++) {
            System.out.print((" ").repeat(index) + "|");
        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            System.out.print(str);
        }
    }
}

// Don't forget to add a string as args while running the program