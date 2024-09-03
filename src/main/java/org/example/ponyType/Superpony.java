package org.example.ponyType;

import org.example.Pony;
import org.example.ability.Fly;
import org.example.ability.Magic;

public class Superpony extends Pony implements Fly, Magic {

    public Superpony(String name, int experienceLevel, int positionX, int positionY) {
        super(name, experienceLevel, positionX, positionY);
    }

    @Override
    public void fly(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        System.out.println(name + "now flying to the next position");
    }

    @Override
    public void doMagic() {
        experienceLevel++;
        char[] symbols = {'*', '#', '&'};
        name += symbols[(int) (Math.random() * symbols.length)];
        System.out.println(name + "perform magic trick and the exp level is " + experienceLevel);
    }

}
