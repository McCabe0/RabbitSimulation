package com.sparta.jm.controller;

import com.sparta.jm.model.BugsBunny;
import com.sparta.jm.model.ElmerFudd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratingPopulation {
    private List<BugsBunny> rabbit = new ArrayList<>();
    private List<ElmerFudd> hunter = new ArrayList<>();
    private int bugsBunny = 1; //Male rabbits
    private int lolaBunny = 1; //Female rabbits
    private int maleHunter = 1;
    private int femaleHunter = 1;
    private int months = 0;
    private final int timeOfSimulation = 18;

    public void creatingSimulator() {
        rabbit.add(new BugsBunny(true));
        rabbit.add(new BugsBunny(false));
        hunter.add(new ElmerFudd(true));
        hunter.add(new ElmerFudd(false));
    }

    public void simulation() {
        creatingSimulator();
        eachMonth();
    }

    public List eachMonth() {
        List<BugsBunny> birthOfRabbit = new ArrayList<>();
        List<BugsBunny> deathOfRabbit = new ArrayList<>();
        List<ElmerFudd> birthOfHunter = new ArrayList<>();
        List<BugsBunny> hunted = new ArrayList<>();
        while (months <= timeOfSimulation) {
            for (BugsBunny bunny : rabbit) {
                if (bunny.getAge() >= 3 && bunny.isFemale())
                    for (int i = 0; i < new Random().nextInt(bunny.getBabies()) + 1; i++) birthOfRabbit.add(new BugsBunny());
                if (bunny.getAge() == 12) deathOfRabbit.add(bunny);
            }
            for (ElmerFudd hunter : hunter) {
                if (hunter.getAge() >= 10 && hunter.isFemale() || (hunter.getMonthsSinceBreading() % 12) == 0)
                    for (int j = 0; j < new Random().nextInt(hunter.getBabies()) + 1; j++) birthOfHunter.add(new ElmerFudd());
                for (int i = 0; i < new Random().nextInt(hunter.getHunting()) + 1; i++) hunted.add(new BugsBunny());
            }
            for (BugsBunny babyRabbit : birthOfRabbit) {
                if (babyRabbit.isFemale()) lolaBunny++;
                 else bugsBunny++;
            }
            for (ElmerFudd hunter : birthOfHunter) {
                if (hunter.isFemale()) femaleHunter++;
                else maleHunter++;
            }
            months++;
            rabbit.removeAll(hunted);
            rabbit.removeAll(deathOfRabbit);
            rabbit.addAll(birthOfRabbit);
            hunter.addAll(birthOfHunter);

            System.out.println(months + ": Rabbits Died from old age: " + deathOfRabbit.size() + " Remaining: " + rabbit.size() + " Male population: " + bugsBunny
                    + " Female population: " + lolaBunny + "\n" +  "\n" + " Hunters alive: " + hunter.size() + " Rabbits hunted " + hunted.size()
                    + " Female Hunters: " + femaleHunter + " Male Hunters " + maleHunter + "\n" );
        }
        return rabbit;
    }

}
