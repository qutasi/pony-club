package org.example.direction;

public class Coordinate {

    public int x;
    public int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(Direction direction) {
        switch (direction) {
            case NORTH: y += 1; break;
            case SOUTH: y -= 1; break;
            case EAST: x += 1; break;
            case WEST: x -= 1; break;
            default:
                System.out.println("Invalid direction");
        }
    }
}
