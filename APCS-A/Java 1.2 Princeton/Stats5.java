public class Stats5 {
    public static void main(String[] args) {
        double num = Math.random();
        double num1 = Math.random();
        double num2 = Math.random();
        double num3 = Math.random();
        double num4 = Math.random();

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println("Smallest is: " + Math.min(Math.min((Math.min(num1, num2)), Math.min(num3, num4)), num));
        System.out.println("Biggest is: " + Math.max(Math.max((Math.max(num1, num2)), Math.max(num3, num4)), num));
        System.out.println("Average is: " + (num + num1 + num2 + num3 + num4) / 5);
    }
}
