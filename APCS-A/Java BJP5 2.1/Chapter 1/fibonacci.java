public class fibonacci {
    public static void main(String[] args) {
        int num0 = 1;
        int num1 = 1;
        for (int i = 1; i <= 12; i += 2) {
            System.out.println(num0);
            num0 += num1;
            System.out.println(num1);
            num1 += num0;
        }
    }
}
