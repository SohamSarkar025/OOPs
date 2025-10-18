package com.soham.interfaces;

public class Main {
    public static void main(String[] args) {
        //Normal Class implementing interfaces
//        Car car1 = new Car();
//        car1.start();
//        car1.stop();

        //Separate subclasses are used in NiceCar class for better usage
        //of method overriding
        NiceCar car2 = new NiceCar();
        car2.start();
        car2.upgradeEngine();
        car2.start();
        car2.startMusic();
    }
}
