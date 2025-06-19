package org.example;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            game();  // call the game method

            System.out.print("Do you want to play again? (Y/N): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("Y")) {
                playAgain = false;
                System.out.println("Thank you for playing!");
            }
        }

        sc.close();
    }

    // game method outside main
    public static void game() {
        Scanner sc = new Scanner(System.in);
        Random rr = new Random();
        int n = rr.nextInt(100) + 1;  // 1 to 100
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("\nYou have 5 attempts to guess the number between 1 and 100");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int gn = sc.nextInt();

            if (gn == n) {
                System.out.println("🎉 Congratulations! You guessed the right number!");
                return;  // exit the game method
            } else if (gn < n) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            attempts++;
        }

        System.out.println("❌ Sorry! You've used all attempts. The number was: " + n);
    }
}
