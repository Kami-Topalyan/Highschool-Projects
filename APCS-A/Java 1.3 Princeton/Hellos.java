public class Hellos {
    public static void main(String[] args) {

        // print out special cases whose ordinal doesn't end in th

        // count from i = 4 to 10
        int count = Integer.parseInt(args[0]);

        for (int i = 1; i <= count; i++) {
            if (i == 1) {
                System.out.println(i + "st Hello");
                continue;
            } else if (i == 2) {
                System.out.println(i + "nd Hello");
                continue;
            } else if (i == 3) {
                System.out.println(i + "rd Hello");
                continue;
            }
            System.out.println(i + "th Hello");
        }

    }
}
