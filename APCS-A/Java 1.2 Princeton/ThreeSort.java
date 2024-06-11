public class ThreeSort {
    public static void main(String[] args) {
        int one = Integer.parseInt(args[0]); // Convert args into strings
        int two = Integer.parseInt(args[1]);
        int three = Integer.parseInt(args[2]);

        int biggest = Math.max(Math.max(one, two), three); // Find biggest
        int smallest = Math.min(Math.min(one, two), three); // Find smallest

        // Print the order by checking if a number is the biggest or smallest if not placing that number in the middle
        if (biggest != one && smallest != one) { 
            System.out.println("Order is: " + smallest + " " + one + " " + biggest);
        }
        else if (biggest != two && smallest != two) {
            System.out.println("Order is: " + smallest + " " + two + " " + biggest);
        }
        else if (biggest != three && smallest != three) {
            System.out.println("Order is: " + smallest + " " + three + " " + biggest);
        }
    }
}
