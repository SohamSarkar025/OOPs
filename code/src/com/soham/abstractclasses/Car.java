package com.soham.abstractclasses;

import com.soham.interfaces.PowerEngine;

public class Car {
    private Engine engine;
    private Media player;

    Car(){
        this.engine= new PetrolEngine();
        this.player=new Player();
    }

    public void upGradeEng(){
        this.engine=new PowerlEngine();
    }

    public void engStart(){
        engine.start();
    }

    public void medStart(){
        player.start();
    }

    public void incVol(){
        player.incVolume();
    }
}
