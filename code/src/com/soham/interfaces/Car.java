package com.soham.interfaces;

public class Car implements Engine, Media{

    public void start(){
        System.out.println("Car is Running");
    }

    public void stop(){
        System.out.println("Car is Stoping");
    }
}
