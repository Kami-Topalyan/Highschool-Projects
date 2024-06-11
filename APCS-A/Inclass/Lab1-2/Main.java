public class Main {

    public static void main(String[] args) {

        Pets cat1 = new Pets("cat", "Snowball");
        Pets cat2 = new Pets("cat", "Apple");

        Pets dog1 = new Pets("dog", "Buck");
        Pets dog2 = new Pets("dog", "Hunter");

        Pets hamster = new Pets("hamster", "sushi");

        Pets.Greetings();

        System.out.println(Lessonfile.solveQuadratic(1, 1, 1));

        System.out.println(Pets.getPetsNum());
        System.out.println(dog2.ToString());

        System.out.println(Pets.getPets());

    }
}

class Lessonfile {

    public static String solveQuadratic(int a, int b, int c) {
        double x1 = (-1 * b + Math.sqrt((b * b - 4 * a * c) / (2 * a)));
        double x2 = (-1 * b + Math.sqrt((b * b - 4 * a * c) / (2 * a)));
        return "The solutions are: " + x1 + "," + x2;
    }
}

class Pets {
    private static String type;
    private static String name;

    private static int catCount;
    private static int dogCount;
    private static int otherCount;
    private static int totalCount;

    public Pets(String t, String n) {
        type = t;
        name = n;
        if (t.equals("cat"))
            catCount++;

        if (t.equals("cat"))
            dogCount++;

        else
            otherCount++;
        totalCount++;
    }

    public static void Greetings() {
        System.out.println("Welcome to the world pets");
    }

    public static int getPetsNum() {
        return totalCount;
    }

    public String ToString() {
        return "the " + type + " is named " + name + " and there are a total of " + totalCount + " pets";
    }

    public static String getPets() {
        return "Dogs: " + dogCount + ", Cats: " + catCount + ", Other pets: " + otherCount;
    }
}
