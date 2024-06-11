public class DayOfWeek {
    public static void main(String[] args) {
        double m = Double.parseDouble(args[0]); // Convert args into double
        double d = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);

        double y2 = (y - Math.floor((14 - m) / 12));
        double x = (y2 + Math.floor(y2 / 4) - Math.floor(y2 / 100) + Math.floor(y2 / 400));
        double m2 = (m + 12 * (Math.floor((14 - m) / 12)) - 2);
        double d2 = ((d + x + 31 * Math.floor(m2 / 12)) % 7);

        // Print The day based on the number recived from d2

        if (d2 == 0.0) {
            System.out.println("Sunday");
        }
        if (d2 == 1.0) {
            System.out.println("Monday");
        }
        if (d2 == 2.0) {
            System.out.println("Tuesday");
        }
        if (d2 == 3.0) {
            System.out.println("Wednesday");
        }
        if (d2 == 4.0) {
            System.out.println("Thursday");
        }
        if (d2 == 5.0) {
            System.out.println("Friday");
        }
        if (d2 == 6.0) {
            System.out.println("Saturday");
        }
        System.out.println(d2);
    }
}
