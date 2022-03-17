package com.company.gamelevel;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    //template method 는 final 붙여줌
    final public void go(int count) {
        run();
        for(int i=0; i<count; i++) {
            jump();
        }
        turn();
    }
 }
