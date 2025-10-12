package com.soham.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new Player();

    NiceCar(){
        this.engine=new PetrolEngine();
    }

    public void upgradeEngine() {
        this.engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }
    public void startMusic(){
        player.start();
    }
}
