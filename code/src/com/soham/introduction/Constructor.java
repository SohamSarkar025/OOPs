package com.soham.introduction;


public class Constructor {
    public static void main(String[] args) {
        Derived d = new Derived(10);
        Derived d2 = new Derived("SohamSarkar",40);
    }
}
class Super{
    int num;
    Super(int num){
        this.num=num;
        System.out.println("Num is "+this.num);
    }
}
class Derived extends Super{
    int num;
    String name;

    Derived(int num){
        super(num);
        System.out.println("Derived Class");
    }
    Derived(String name, int num){
        super(num);
        this.name=name;
        System.out.println("Hello "+this.name);
    }
}