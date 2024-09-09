package org.example;

import org.example.direction.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class PonyClub {

    private List<User> users;

    public PonyClub() {
        this.users = new ArrayList<>();
    }

    public User userWithTheHighestPonyExpLevel() {
        User topUser = null;
        Pony highestExpPony = null;

        for (User user : users) {
            Pony userHighestExpPony = user.getHighestExpPony();
            if (userHighestExpPony != null) {
                if (highestExpPony == null || userHighestExpPony.getExperienceLevel() > highestExpPony.getExperienceLevel()) {
                    highestExpPony = userHighestExpPony;
                    topUser = user;
                }
            }
        }
        return topUser;
    }

    public List<Pony> poniesAtPosition(Coordinate position) {
        List<Pony> result = new ArrayList<>();
        for (User user : users) {
            result.addAll(user.getPoniesWithSamePosition(position));
        }
        return result;
    }
}
