package people;
public class Main {
public static void main(String[] args) {
    people barb = new people();
    barb.changeAge(14);
    barb.changeFName("Barb");

    people steph = new people("Stepth", "Smith", 21);
    people steph2 = new people("Stepth", "Jones", 25);
    people steph3 = new people("Stepth", "Smith", 21);

    System.out.println(barb.canDrive());
    System.out.println(steph.canDrive());

    System.out.println(steph.getLicense());
    System.out.println(barb.getLicense());

    System.out.println(steph.sameFirstName(steph2));
    System.out.println(steph.sameLastName(steph2));

    System.out.println(steph.dups(steph2));
    System.out.println(steph.dups(steph3));


}
}

class people {

    private String firstName;
    private String lastName;
    private int age;

    public people() {
        firstName = "";
        lastName = "";
        age = 0;
    }

    public people(String fName, String lName, int ag) {
        firstName = fName;
        lastName = lName;
        age = ag;
    }

    public void changeAge(int newAge) {
        age = newAge;
    }

    public void changeFName(String newFName) {
        firstName = newFName;
    }


    public boolean canDrive() {
        if (age >= 16) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getLicense() {
        if (canDrive()) {
            return "time to get a license";
        } else {
            return "no license for you!";
        }
    }
    
    public boolean sameFirstName(people other) {
        return firstName.equals(other.firstName);
    }

    public boolean sameLastName(people other) {
        return lastName.equals(other.lastName);
    }

    public String dups(people other) {
    if (firstName.equals(other.firstName) && lastName.equals(other.lastName))
    return firstName + " " + lastName + " and " + other.firstName + " " + other.lastName + " are dubs";
    else
    return firstName + " " + lastName + " and " + other.firstName + " " + other.lastName + " are NOT dubs";
    }
}
