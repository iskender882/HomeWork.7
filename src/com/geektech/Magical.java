package com.geektech;

public class Magical extends Warrior implements InfinityWar{

    @Override
    public void toApplySuperAbilities() {

    }

    @Override
    public void abilities(int superAbilities) {
        System.out.println("Маг применил " + superAbilities);
    }
}
