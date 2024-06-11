import java.util.Random;

public class RollLoadedDie {
    public static void main(String[] args) {
        Random random = new Random();
        int die = random.nextInt(1, 9);
        System.out.println(die);
        if (die < 5) {
            if (die == 1) {
                System.out.println("You rolled a 1");
            }

            else if (die == 2) {
                System.out.println("You rolled a 2");
            }

            else if (die == 3) {
                System.out.println("You rolled a 3");
            }

            else if (die == 4) {
                System.out.println("You rolled a 4");
            }

            else if (die == 5) {
                System.out.println("You rolled a 5");
            }
        } else {
            System.out.println("You rolled a 6");
        }
    }
}
