package com.soham.introduction;

public class WrapperClassExample {

    public static void main(String[] args) {
       final A a1 = new A("Soham");
       //Cannot reassign a to final  ref variable
        // we just change the
//       a1 = new A("Other Object");
        A a2 = new A(a1);
        System.out.println(a2.name);
    }


    static  class A{

        final int size = 15;
        String name;

        A(String name) {
            this.name = name;
        }
        A(A other){
            this.name = other.name;
        }
    }
}
