package com.soham.staticExample;

public class Human {
    String name;
    //Static variables does not depend on the objects
    //Same for all the objects like population
    static long population;

    Human(String name){
        this.name=name;
        //As static variables is object independent
        //So for accessing it or modifying it
        //we should use the className not the object reference variable
        Human.population += 1;
    }
}
