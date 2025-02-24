import java.util.Scanner;

public class RollDiceApp {
    public static void main(String[] args) {

        die die1 = new die();
        die die2 = new die();


        Scanner scanner = new Scanner(System.in);
        char answer = 'y';

        while (answer == 'y') {

            int rollDie1 = die1.roll();
            int rollDie2 = die2.roll();
            int total = rollDie1 + rollDie2;


            System.out.println("the total value rolled between both dice is " + total);


            System.out.println("do you want to roll the dice again? y/n");
            answer = scanner.next().charAt(0);
        }


        System.out.println("the total sum of dice 1 value rolled is: " + die1.getTotal());
        System.out.println("the total sum of dice 2 values rolled is: " + die2.getTotal());
    }
}

