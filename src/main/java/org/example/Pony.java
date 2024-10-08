package org.example;

import org.example.direction.Coordinate;
import org.example.direction.Direction;

public abstract class Pony {

    protected String name;
    protected int experienceLevel;
    protected Coordinate position;

    public Pony(String name, int experienceLevel, int positionX, int positionY) {
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.position = new Coordinate(positionX, positionY);
    }

    public void renamePony(String newName) {
        this.name = newName;
    }

    public void walk(Direction direction) {
        position.move(direction);
        System.out.println(name + " walked "+ direction + " to position " + position);
    }

    public Coordinate getPosition() {
        return position;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

}
