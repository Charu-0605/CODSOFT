package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("deposit successful. New balance : "+ balance);
        }
        else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("withdrawl successful. New balance : "+ balance);
        }
        else {
            System.out.println("insufficient amount or balance");
        }
    }

    public void checkbalance()
    {
        System.out.println("current balance : "+balance);
    }
}
