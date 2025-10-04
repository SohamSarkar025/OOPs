package com.soham.introduction;



public class Main {
//    //Day[01] ->  3-10-2025
//    public static void main(String[] args) {
//        //soham is a  reference variable
//        Student soham = new Student();
//        //update the property of a object
//        soham.rollNo=40;
//        System.out.println(soham.rollNo);
//    }
//}
//class Student{
//    int rollNo; // this variable is instance variable
//    String name;
//    float marks;
//}

//Day[02] -> 4-10-2025
//Creating a Student Class
static class Student {

        int rno;
        String name;
        float marks;


    //Default Constructor
    Student() {
        this.rno=12;
        this.name="Soham";
        this.marks=71.5f;

        //Here "this" is used to call another constructor
        //internally "this" refers to Student(0,"Default",0.0f);
       // this (0,"Default",0.0f);
    }


    //Parameterized Constructor
    Student(int rno,String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(5,"Shevanti",69.8f);
        System.out.println(s2.name);
        System.out.println(s1.name);
    }
}