package com.soham.interfaces;

public class Car implements Engine, Media{

    public void start(){
        System.out.println("Car is running");
    }


    public void stop(){
        System.out.println("Car is Stop");
    }

    public void acc(){
        System.out.println("Car is running");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
