package com.soham.staticExample;

public class StaticBlock {
    static int a=5;
    static int b;

    //Static method only runs when the class is loaded for the first time
    static {
        System.out.println("This is a Static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock b1 = new StaticBlock();
        System.out.println(b1.a +" "+b1.b);
        b1.b = b1.b + 3;
        System.out.println(b1.a +" "+b1.b);


        StaticBlock b2 = new StaticBlock();
        System.out.println(b2.a +" "+b2.b);
    }
}
