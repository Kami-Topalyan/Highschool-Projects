public class fibonacci {
    public static void main(String[] args) {
        long num0 = 1; // Set starting number as 1
        long num1 = 2; // Set starting number as 2
        long num2;
        long sum = 0;

        while (num1 <= 4000000) { // Check if the vlaue is above 4mil
            num2 = num0 + num1; // We add the second previous number and the previous number to find the new
                                // number
            num0 = num1; // We save the previous number in Num0
            num1 = num2; // We store the new number of second previous number and the previous number in
                         // Num1
            if (num1 % 2 == 0) {
                sum += num1;
            } // We check if the new number is even and we add it to the sum
        }
        System.out.println(sum);

    }
}
