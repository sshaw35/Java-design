import java.util.Scanner;

public class Roll3Dice {
    public static void main(String[] args) {

        die die1 = new die();
        die die2 = new die();
        die die3 = new die();

        Scanner scanner = new Scanner(System.in);
        char answer = 'y';

        while (answer == 'y') {

            int roll1 = die1.roll();
            int roll2 = die2.roll();
            int roll3 = die3.roll();
            int total = roll1 + roll2 + roll3;


            System.out.println("You rolled: " + roll1 + ", " + roll2 + ", " + roll3);
            System.out.println("Total: " + total);


            if (total % 5 == 0) {
                System.out.println("the total is a multiple of 5!");
            } else {
                System.out.println("the total is not a multiple of 5");
            }


            System.out.println("Do you want to roll againy/n");
            answer = scanner.next().charAt(0);
        }


        System.out.println("avg value of Die 1: " + die1.getAverage());
        System.out.println("avg value of Die 2: " + die2.getAverage());
        System.out.println("avg value of Die 3: " + die3.getAverage());
    }
}

