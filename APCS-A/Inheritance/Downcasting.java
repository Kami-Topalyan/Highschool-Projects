public class Downcasting {
    public static void main(String[] args) {
        Vehicle car = new Car("Tesla"); // creating a Car object with the data type vehicle
        System.out.println(car);
        ((Car) car).changeModel("Buggati"); // Downcasting car so that it can access the methods from Car class as the super class doesnt have the method defined. 
        System.out.println(car); // No need to downcast as toString is a built-in method of all Objects so we are just overloading 
    }
}

class Vehicle {

}

class Car extends Vehicle {
    private String model;

    public Car(String m) {
        model = m;
    }

    public void changeModel(String m) {
        model = m;
    }

    public String toString() {
        return model;
    }
}