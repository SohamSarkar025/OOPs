package com.soham.singleon;

//A Singleton class is referred as only one object should be created for this class
//Main method should not use the constructor because using the constructor
//user can create new object.

public class Singleton {
    //Private Constructor
    private Singleton() {

    }

    //As Object Independent so static variable of type Singleton
    private static Singleton instance;


    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
