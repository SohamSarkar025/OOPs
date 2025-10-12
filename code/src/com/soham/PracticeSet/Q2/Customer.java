package com.soham.PracticeSet.Q2;

public class Customer {
    private String name;
    private double initialDeposit;
    private double balance;

    private Customer(String name,double initialDeposit){
        this.name=name;
        this.balance=initialDeposit;
    };

    public void withdrawl(double amt){
        if(this.balance<amt){
            System.out.println("Insufficient Balance");
        }
        this.balance -= amt;
    }

    public static Customer createAcc(String name,double initialDeposit){
        Customer obj = new Customer(name,initialDeposit);
        return obj;
    }

    public double getBalance() {
        return balance;
    }

    public String getName(){
        return name;
    }

    public void getinfo(){
        System.out.println("Customer Name: "+name+", Balance: "+balance);
    }
}
