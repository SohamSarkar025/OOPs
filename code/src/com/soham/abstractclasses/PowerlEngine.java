package com.soham.abstractclasses;

public class PowerlEngine extends Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }
}
