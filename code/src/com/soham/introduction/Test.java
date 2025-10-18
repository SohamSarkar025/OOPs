package com.soham.introduction;

public class Test {
    static class Main{
        static String name;
        Main(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Main ob1 = new Main("Soham");
        Main ob2 = new Main("Ramkrishna");
        ob2.name="Kunal";
        System.out.println(ob2.name);
    }
}
