public class Dragon {
    public static void main(String[] args) {
        String curve0 = "F"; //Create the first instruction
        
        String othercurve0 = "F"; //Create the first instruction

        String curve1 = curve0 + "L" + othercurve0; //Create FLF

        String othercurve1 = curve0 + "R" + othercurve0; //Create FRF

        String curve2 = curve1 + "L" + othercurve1; //Create FLFLFRF

        String othercurve2 = curve1 + "R" + othercurve1;  //Create FLFRFRF

        String curve3 = curve2 + "L" + othercurve2; //Create FLFLFRFLFLFRFRF

        String othercurve3 = curve2 + "R" + othercurve2; //Create FLFLFRFRFLFRFRF

        String curve4 = curve3 + "L" + othercurve3; //Create FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRF

        String othercurve4 = curve3 + "R" + othercurve3; //Create FLFLFRFLFLFRFRFRFLFLFRFRFLFRFRF

        String curve5 = curve4 + "L" + othercurve4; //Create FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRFLFLFLFRFLFLFRFRFRFLFLFRFRFLFRFRF


        // Print the Varibles
        System.out.println("Step one: " + curve0);
        System.out.println("Step two: " + curve1);
        System.out.println("Step three: " + curve2);
        System.out.println("Step four: " + curve3);
        System.out.println("Step five: " + curve4);
        System.out.println("Step six: " + curve5);
    }

}
