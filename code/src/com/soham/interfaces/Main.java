package com.soham.interfaces;

public class Main {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();

        car.start();
        car.upgradeEngine();
        car.start();
        car.startMusic();
    }
}
