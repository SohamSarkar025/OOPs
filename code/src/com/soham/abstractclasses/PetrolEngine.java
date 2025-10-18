package com.soham.abstractclasses;

public class PetrolEngine extends Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine Stops");
    }
}
