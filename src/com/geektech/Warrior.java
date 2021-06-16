package com.geektech;

public abstract class Warrior implements InfinityWar{

    @Override
    public void toApplySuperAbilities() {
        System.out.println("Warrior применил супер способность");

    }
    public abstract void abilities(int superAbilities);
}
