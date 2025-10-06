package com.soham.introduction;
//4. Reference Variable Manipulation
//Question:
//Consider the Book class from Question 1.
//
//Create two Book objects: bookA and bookB.
//
//Create a third reference variable bookC and make it point to the same object as bookA. (i.e., bookC = bookA;)
//
//Change the title of the book object referenced by bookC.
//
//Print the title of bookA.
//
//Expected Outcome Test: What do you expect to see for the title of bookA, and why? (This tests the concept that bookA and bookC are references to the same object in memory.)
public class Practice4 {
    public static void main(String[] args) {
        Practice1.Book bookA = new Practice1.Book("Feluda","Satyajit Roy","ABC");
        System.out.println(bookA.title);
        Practice1.Book bookB = new Practice1.Book("Feluda Samagra","Satyajit Roy","ABCD");
        //book C is referencing to same object of bookA,
        //so any change made by bookC is also noticeable by bookA.
        Practice1.Book bookC = bookA;
        bookC.title="New Book by Satyajit Roy";
        System.out.println(bookA.title);
    }
}
