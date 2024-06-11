public class Multiples {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 1000; i++) { // For loop to get i
            if (i % 3 == 0 || i % 5 == 0) { // If fully divideable by 3 or 5
                sum += i; // add i to the sum
            }
        }
        System.out.println(sum);

    }
}