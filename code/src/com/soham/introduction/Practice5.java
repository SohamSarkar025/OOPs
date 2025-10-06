package com.soham.introduction;
//5.Passing References to a Method (Optional Challenge)
//Question:
//Create a class called Box with one instance variable: value (int).
//Implement a method outside of Box (e.g., in your Main class)
//called resetValue(Box b) that sets the value of the passed Box object to 0.
//
//In your main method:
//
//Create a Box object with an initial value of 100.
//
//Call resetValue() and pass the object's reference.
//
//Print the value of the original Box object.
//
//Goal: Understand that when an object reference is passed to a method,
//the method can modify the state (instance variables) of the object the reference points to.

public class Practice5 {

    public static void main(String[] args) {
        Box a = new Box(100);
        System.out.println(a.value);
        resetvalue(a);
        System.out.println(a.value);
    }

    protected static void resetvalue(Box b){
        b.value=0;
    }
}
class Box{
    int value;
    Box(int value){
        this.value=value;
    }
}
