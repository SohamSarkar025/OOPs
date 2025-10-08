package com.soham.properties.inheritance;

public class Box {
    double h;
    double w;
    double l;

    Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }

    Box(double side){
        this.h=side;
        this.w=side;
        this.l=side;
    }

    Box(double h,double w,double l){
        this.w=w;
        this.h=h;
        this.l=l;
    }

    Box(Box a){
        this.w=a.w;
        this.h=a.h;
        this.l=a.l;
    }

    public void info(){
        System.out.println("The box is running");
    }
}
