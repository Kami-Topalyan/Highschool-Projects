public class Inheritance {
    public static void main(String[] args) {
        Pet pet = new Pet("John", 10, "cat");
        Dog dog = new Dog("Michael", 18); // no need for type as we dont use it in Dog

        System.out.println(pet);
        System.out.println(dog); //outputs toString due to toString automatically being used when a string is needed
    }
}

class Pet { // Super class that stores most varibles
    private String name;
    private int age;
    private String type;

    public Pet(String n, int a, String t) { // Constructor for the Super class which can be accessed via super keyword
        name = n;
        age = a;
        type = t;
    }

    public String toString() { //Method to return all varibles
        return name + " " + age + " " + type;
    }
}

class Dog extends Pet{ // subclass from the super ckass Pet

    public Dog(String n, int a) { // constructor for the subclass
        super(n,a, "Dog");
    }

    public String toString() { // overloading the method from the super class to have woof woof added to the end of it
        return super.toString() + " Woof Woof";
    }
}