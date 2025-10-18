package com.soham.abstractclasses;

public class Player extends Media{

//    Player(){
//        super();
//    }
    @Override
    public void start() {
        System.out.println("Media Player Starts");
    }

    @Override
    public void stop() {
        System.out.println("Media Player Stops");
    }

    @Override
    public void incVolume() {
        super.incVolume();
    }
}
