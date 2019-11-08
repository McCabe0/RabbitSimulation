package com.sparta.jm.model;

public class Animal {
    
    protected int age;
    protected boolean isFemale;
    protected int babyMakingAge;
    protected int maxAge;
    protected int babies;

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getBabies() {
        return babies;
    }

    public void setBabies(int babies) {
        this.babies = babies;
    }

    public int getAge() {
        age++;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public int getBabyMakingAge() {
        return babyMakingAge;
    }

    public void setBabyMakingAge(int babyMakingAge) {
        this.babyMakingAge = babyMakingAge;
    }

    public int getDeathOfBugsbunny() {
        return maxAge;
    }

    public void setDeathOfBugsbunny(int deathOfBugsbunny) {
        this.maxAge = deathOfBugsbunny;
    }
}
