package com.soham.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human soham = new Human("Soham");
//        Human antara = new Human("Antara");
//        System.out.println(soham.population);
//        System.out.println(antara.population);
    }

    static void fun(){
        //We cant use non-static methods from a static method
        //As static methods don't depend on objects
//        greeting();

        //We have to reference an object to use non static methods
        Main obj = new Main();
        obj.greeting();
    }

    void greeting(){
        System.out.println("Hello World");
    }
}
