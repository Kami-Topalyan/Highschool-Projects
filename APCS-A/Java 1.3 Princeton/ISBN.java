public class ISBN {
    public static void main(String[] args) {
        String number = args[0];
        int invertNumber;
        int legealNumb = 0;
        int j = 0;
        String fullNum = "";
        for (int i = number.length() - 1; i >= 0; i--) { // the result of the formula
            invertNumber = number.charAt(i); // Invert
            j += 1; // extra incrementing number
            legealNumb += j * invertNumber; // formula
        }

        if (legealNumb % 11 == 0) { // check to see if the number is legal
            for (int i = 0; i < 10; i++) { // for loop to find where we are at in the string
                fullNum += number.charAt(i); // add the numbers one by one
                if (i == 0 || i == 3 || i == 8) // if its in one of the positions to have a - add it
                    fullNum += "-";
            }
        }
        System.out.println(fullNum);
    }
}