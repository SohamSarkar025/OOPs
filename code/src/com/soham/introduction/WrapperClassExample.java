package com.soham.introduction;

public class WrapperClassExample {

    public static void main(String[] args) {
//       final A a1 = new A("Soham");
       //Cannot reassign a to final  ref variable
        // we just change the
//       a1 = new A("Other Object");


        //Garbage Collection example
        A obj;
        for(int i=0;i<10000000;i++){
            obj = new A("Random");
        }
    }


    static  class A{

        final int size = 15;
        String name;

        A(String name) {
            this.name = name;
//            System.out.println("Object is Created");
        }

        //Finalize method is used to do something when the object
        //is being destroying by the garbage collector
        @Override
        protected void finalize() throws  Throwable{
            System.out.println("Object is destroying....");
        }
    }
}
