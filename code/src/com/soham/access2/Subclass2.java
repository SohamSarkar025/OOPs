package com.soham.access2;

import com.soham.access.A;

public class Subclass2 extends A {
    Subclass2(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        A obj = new A(40,"Soham");
        //Only the subclass can access the protected variable from a diff package.
//        int n=obj.num;
    }
}
