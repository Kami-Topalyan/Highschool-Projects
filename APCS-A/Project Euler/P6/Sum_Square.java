import java.lang.Math;

public class Sum_Square {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int dif = 0;

        for (int i = 1; i <= 100; i++) {
            num1 += Math.pow(i, 2);
        }
        for (int i = 1; i <= 100; i++) {
            num2 += i;
        }
        num2 = (int) Math.pow(num2, 2);
        dif = num2 - num1;
        System.out.println("Difference is: " + dif);
    }
}