package com.geektech;

public class Mental extends Warrior implements InfinityWar{

    @Override
    public void toApplySuperAbilities() {

    }

    @Override
    public void abilities(int superAbilities) {
        System.out.println("Mental применил " + superAbilities);
    }

}
