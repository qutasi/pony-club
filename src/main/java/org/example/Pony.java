package org.example;

public class Pony {

    protected String name;
    protected int experienceLevel;
    protected int positionX;
    protected int positionY;

    public Pony(String name, int experienceLevel, int positionX, int positionY) {
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public void walk(String direction) {
        switch (direction) {
            case "NORTH": positionY += 1; break;
            case "SOUTH": positionY -= 1; break;
            case "EAST": positionX += 1; break;
            case "WEST": positionX -= 1; break;
            default:
                System.out.println("Invalid direction: " + direction);
        }
        System.out.println(name + " walked " + direction);
    }


    public String getName() {
        return name;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
