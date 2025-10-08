package com.soham.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(7.0,4.4,5.4);
//        Box box2 = new Box(box1);
//        box1.info();
//        System.out.println(box2.w+" "+box2.h+" "+box2.l);


        BoxWeight b1 = new BoxWeight(4.5,47.5,5.1,4.2);
        System.out.println(b1.w+" "+b1.h+" "+b1.l+" "+b1.weight);

        //Here the ref type is box and the object type is boxweight
        //We can only access the properties of ref type object, as box dont have any concept
        //of weight , so we can't access weight.
//        Box box3 = new BoxWeight(4.5,41.2,2.3,3.2);
//        System.out.println(box3.weight);

        //Here box4 is referencing BoxWeight Object, We want to create box object
        // error beacuase we cannot initialize weight from box object
//        BoxWeight box4 = new Box(1,2,3);

    }
}
