import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args)  {
        Random rand = new Random();
        int answer = rand.nextInt(100);
        System.out.println(answer);
        double guess = -1;
        boolean repeating = true;


        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Guess the number: ");
            guess = reader.nextDouble();

            while (repeating == true) {
                if ((int)guess > answer) {
                    System.out.println("The number is smaller than that try again: ");
                    guess = reader.nextInt();
                }
                else if ((int)guess < answer) {
                    System.out.println("The number is bigger than that try again: ");
                    guess = reader.nextInt();
                }
                else if ((int)guess == answer) {
                    System.out.println("Correct Guess ");
                    repeating = false;
                }
            }
        }
        System.out.println("Congrats you win! ");
    }
}