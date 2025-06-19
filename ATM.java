package org.example;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount(1000);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw : ");
                    double withdrawamt= sc.nextInt();
                    acc.withdraw(withdrawamt);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit : ");
                    double depositamt= sc.nextInt();
                    acc.deposit(depositamt);
                    break;
                case 3:
                    acc.checkbalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}

