public class kedi {
    public static void main(String[] args) {
        Kedi kedi1 = new kedi(10, 20, "cat"); // create kedi1 object

        kedi1.TellAge(); // call the functions
        kedi1.Talk(); // call the functions
        kedi1.Weight(); // call the functions
    }
}

class Kedi { // create the other class to call with objects
    private int yas; // instances
    private int kilo; // instances
    private String isim; // instances

    public kedi() { // create a default constructor
        yas = 0;
        kilo = 0;
        isim = "";
    }

    public kedi(int ya, int kil, String ism) { // create a constructor
        yas = ya;
        kilo = kil;
        isim = ism;
    }

    public void TellAge() { // print age
        System.out.println("I am " + yas + " years old");
    }

    public void Weight() { // print weight
        System.out.println("I weigh " + kilo + " kilos");
    }

    public void Talk() { // print name
        System.out.println("My name is " + isim);
    }

    public static void main(String[] args) {

    }
}
