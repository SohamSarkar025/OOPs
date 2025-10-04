package com.soham.introduction;

public class Practice1 {
//    1. Simple Class Design & Instantiation
//    Question:
//    Create a class called Book with the following instance variables:
//    title (String)
//    author (String)
//    isbn (String)
//    isAvailable (boolean, initialized to true by default)

//    Implement a constructor that takes the title, author, and isbn as parameters and uses them to initialize the instance variables.
//    Then, in a separate Main class or method:
//    Use the new keyword to create two Book objects.
//    Print the details of both books, including their availability.

    static  class Book{
        String title;
        String author;
        String isbn;
        boolean isAvailable = true;
        Book (String title, String author,String isbn){
            this.title=title;
            this.author=author;
            this.isbn = isbn;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Feluda","Satyajit Roy","ABC");
        Book book2 = new Book("Feluda Samagra","Satyajit Roy","ABCD");
        System.out.println(book1.title+" "+book1.author+" "+book1.isbn+" "+book1.isAvailable);
        System.out.println(book2.title+" "+book2.author+" "+book2.isbn+" "+book2.isAvailable);
    }
}
