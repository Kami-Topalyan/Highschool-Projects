public class nestedNumbers_3 {
    public static void main(String[] args) {
        for (int b = 0; b < 4; b++) { // print lines
            for (int i = 9; i > 0; i--) { // remove 1 from i per loop
                for (int a = 0; a < i; a++) // print the i
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
