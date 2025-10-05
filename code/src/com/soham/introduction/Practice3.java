package com.soham.introduction;

//3. Instance Variables & State Management
//Question:
//Create a class named BankAccount with two instance variables:
//accountHolderName (String)
//balance (double)

//Implement a constructor to initialize the accountHolderName and set the initial balance to a provided value.
//Now, add two methods to manage the account state:
//deposit(double amount): Increases the balance.
//withdraw(double amount): Decreases the balance, but only if the balance is greater than or equal to the amount.
//If the withdrawal fails, print a message.

//In your main code, create a BankAccount object
//and call the deposit and withdraw methods to
//show how the object's instance variables (balance) change over time.


public class Practice3 {
    static class BankAccount{
        String accountholderName;
        double balance;

        BankAccount(String name, double bal){
            this.accountholderName=name;
            this.balance=bal;
        }

        void deposit(double amt){
            this.balance += amt;
        }
        void withdrawl(double amt){
            if(this.balance >= amt ){
                this.balance -= amt;
            }else{
                System.out.println("Insufficient Balance");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Soham",1000);
        BankAccount a2 = new BankAccount("Antara",2000);
        System.out.println("Initial balance: "+a1.balance);
        a1.deposit(1000);
        System.out.println(a1.balance);
        a1.withdrawl(2001);
    }
}
