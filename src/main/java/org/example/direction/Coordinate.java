package org.example.direction;

import java.util.Objects;

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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Override equals() to compare x and y values
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    // Override hashCode() so it works consistently with equals()
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
