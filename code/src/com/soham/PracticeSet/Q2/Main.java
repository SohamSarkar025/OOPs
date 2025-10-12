package com.soham.PracticeSet.Q2;

//Question B: Bank Account with Controlled Access
//Create a Customer class that has a private instance variable: balance (double).
//
//Strict Withdrawal: Implement a withdraw(double amount) method
//that uses the private keyword to ensure only this method can directly modify the balance.
//
//private Constructor: Make the constructor private.
//
//static Factory Method: Provide a public static method
//called createAccount(String name, double initialDeposit)
//that handles the creation of a new Customer object and returns its reference.
//(This demonstrates controlled object creation, a common design pattern).

import static com.soham.PracticeSet.Q2.Customer.createAcc;

public class Main {
    public static void main(String[] args) {
        Customer cus1 = createAcc("Soham",1000);
        cus1.getinfo();
        cus1.withdrawl(100);
        cus1.getinfo();
    }
}
