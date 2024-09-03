package org.example.ponyType;

import org.example.Pony;
import org.example.ability.Fly;

public class Pegasus extends Pony implements Fly {

    public Pegasus(String name, int experienceLevel, int positionX, int positionY) {
        super(name, experienceLevel, positionX, positionY);
    }

    @Override
    public void fly(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        System.out.println("Pegasus is now flying to next position");
    }
}
