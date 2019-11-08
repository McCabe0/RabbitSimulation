package com.sparta.jm.model;

import java.util.Random;

public class ElmerFudd extends Animal {

    private int hunting;
    private int monthsSinceBreading;
    {
        babyMakingAge = 10;
        babies = 10;
        maxAge = 20;
        hunting = 20;
    }

    public ElmerFudd(){
        age = 0;
        isFemale = new Random().nextBoolean();
    }

    public ElmerFudd(boolean isFemale){
        this.isFemale = isFemale;
    }
    public int getHunting() {
        return hunting;
    }

    public int getMonthsSinceBreading() {
        monthsSinceBreading ++;
        return monthsSinceBreading;
    }
}
