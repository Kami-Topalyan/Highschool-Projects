public class CartesianToPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        System.out.println("R is: " + r);
        System.out.println("Theta is: " + Math.atan2(y, x));
    }
}
