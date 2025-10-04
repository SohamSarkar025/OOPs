package com.soham.introduction;


//Day[01] ->  3-10-2025
public class Main {
    public static void main(String[] args) {
        //soham is a  reference variable
        Student soham = new Student();
        //update the property of a object
        soham.rollNo=40;
        System.out.println(soham.rollNo);
    }
}
class Student{
    int rollNo; // this variable is instance variable
    String name;
    float marks;
}
//Day[02] -> 4-10-2025

