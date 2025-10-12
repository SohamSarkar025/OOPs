package com.soham.PracticeSet.Q1;

//1. Encapsulation & Access Control Questions 🔒
//These test your understanding of protecting data and controlling class interaction.


//Question A: Configuration Manager Design
//Design a class named AppConfig to manage application settings (like databaseURL, portNumber).
//Encapsulation: Make the instance variables private.
//Access: Provide public getter methods (e.g., getDatabaseURL()).
//Prevent Modification: Do not provide any setter methods to ensure that once the configuration is set in the constructor,
//it cannot be changed later.
//final Usage: Use the final keyword on the instance variables to enforce that they are set only once.
//Demonstrate creating an object and trying to modify its properties directly (which should fail/be blocked by your design).

public class Main {
    public static void main(String[] args) {
        AppConfig app1 = new AppConfig("/soham/url1",200);
        System.out.println(app1.getDataBaseUrl());
        System.out.println(app1.getPortNumber());
    }
}
