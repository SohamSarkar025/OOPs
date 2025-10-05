package com.soham.introduction;
//2. Constructor Overloading & this Keyword
//Question:
//Design a class called Student that has:
//studentId (int)
//name (String)
//gpa (double)

//Implement two constructors:

//Default Constructor: Initializes studentId to 0, name to "Unknown", and gpa to 0.0.
//Parameterized Constructor: Takes studentId and name as arguments.
// This constructor should call the default constructor using this() to set the default values first,
// and then override studentId and name with the provided arguments.
//Demonstrate creating one object using each constructor.

public class Practice2 {
    public static void main(String[] args) {
        Student a = new Student();
        Student soham = new Student(40,"Soham");
        System.out.println(a.name);
        System.out.println(soham.name);
        System.out.println(soham.gpa);
    }
    static class Student{
        int studentId;
        String name;
        double gpa;

        //Default Constructor
        Student(){
            this.studentId=0;
            this.name="UnKnown";
            this.gpa=1.0;
        }
        Student(int studentId, String name){
            //Caliing the default constructor by this keyword
            this();
            this.studentId=studentId;
            this.name=name;
        }
    }
}
