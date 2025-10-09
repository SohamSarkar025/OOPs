package com.soham.access;

public class Subclass extends  A{
    Subclass(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        A obj = new Subclass(40,"Soham");
        int n=obj.num;
    }
}
