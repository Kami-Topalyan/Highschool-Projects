public class DollarFigure {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int a = 0; a < 2 * i - 2; a++)
                System.out.print("*");

            for (int a = 0; a < -i + 8; a++)
                System.out.print("$");

            for (int a = 0; a < -2 * i + 16; a++)
                System.out.print("*");

            for (int a = 0; a < -i + 8; a++)
                System.out.print("$");

            for (int a = 0; a < 2 * i - 2; a++)
                System.out.print("*");

            System.out.println();
        }
    }
}