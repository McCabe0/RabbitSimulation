package com.sparta.jm.model;

import java.util.Random;

public class BugsBunny extends Animal{
    {
         babyMakingAge = 3;
         maxAge = 15;
         babies = 14; //max babies
    }

    public BugsBunny(){
        age = 0;
        isFemale = new Random().nextBoolean();
    }
    public BugsBunny(boolean isFemale){
        this.isFemale = isFemale;
    }
    @Override
    public String toString() {

        return "BugsBunny{" +
                "Months lived:" + age +
                ", isFemale=" + isFemale +
                "} \n";
    }
}
