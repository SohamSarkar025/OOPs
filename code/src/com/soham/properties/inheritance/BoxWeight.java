package com.soham.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        super();
        this.weight=-1;
    }

    BoxWeight(double w,double h,double l, double weight){
        //Super Keyword calls the parent class constructor
        //used to initialize values or modify values in parent class
        super(h, w, l);
        this.weight=weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }
}
