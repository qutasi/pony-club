package org.example.ponyType;

import org.example.Pony;
import org.example.ability.Magic;

public class Unicorn extends Pony implements Magic {

    public Unicorn(String name, int experienceLevel, int positionX, int positionY) {
        super(name, experienceLevel, positionX, positionY);
    }

    @Override
    public void doMagic() {
        experienceLevel++;
        char[] symbols = {'*', '#','&'};
        name += symbols[(int) (Math.random() * symbols.length)];
        System.out.println(name + " perform magic and the experience lvl is " + experienceLevel);
    }
}
