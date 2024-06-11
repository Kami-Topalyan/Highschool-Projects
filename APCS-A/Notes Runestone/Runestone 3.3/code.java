// Copy in your link to your code on repl.it here:
// Copy in all of your code from repl.it below (include import and public class Main)

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        System.out.println("\n\nLet's play 20 questions. Choose an animal and I will try to guess it!");
        Scanner scan = new Scanner(System.in);

        System.out.println("Is it a mammal (y/n)?");
        String answer = scan.nextLine();
        if (answer.equals("y")) {
            System.out.println("Is it a pet (y/n)?");
            answer = scan.nextLine();
            if (answer.equals("y")) {
                System.out.println("Does it scratch your furniture (y/n)?");
                answer = scan.nextLine();
                if (answer.equals("n")) {
                    System.out.println("I guess a dog! Click on run to play again.");
                }
                else if (answer.equals("y")) {
                    System.out.println("I guess a cat! Click on run to play again.");
                }
                else {
                    System.out.println("Not Valid");
                }
            } else {
                System.out.println("I guess an elephant! Click on run to play again.");
            }
        } else { // not a mammal
            System.out.println("I guess a bird! Click on run to play again.");
        }
        if (false) {
            answer = scan.nextLine();
        }
        else {
            return;
        }
}
}