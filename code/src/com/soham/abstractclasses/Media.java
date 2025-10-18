package com.soham.abstractclasses;

public abstract class Media {
    public abstract void start();
    public abstract void stop();
    public void incVolume(){
        System.out.println("The volume is increasing");
    }
}
