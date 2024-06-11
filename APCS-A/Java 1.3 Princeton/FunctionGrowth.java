import java.lang.Math;

public class FunctionGrowth {
    public static void main(String[] args) {
        for (int i = 16; i <= 2048;) {
            System.out.println((int) Math.log(i));
            System.out.println(i);
            System.out.println((int) (i * Math.log(i)));
            System.out.println(i * i);
            System.out.println(i * i * i);
            i += i;
        }
    }
}