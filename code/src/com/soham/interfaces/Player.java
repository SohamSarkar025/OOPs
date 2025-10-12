package com.soham.interfaces;

public class Player implements Media {
    @Override
    public void start() {
        System.out.println("Media Starts");
    }

    @Override
    public void stop() {
        System.out.println("Media Stops");
    }
}
