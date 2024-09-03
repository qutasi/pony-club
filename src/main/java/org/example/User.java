package org.example;

import org.example.ponyType.Superpony;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private LocalDate registrationDate;
    private List<Pony> ponies;

    public User(String userName, LocalDate registrationDate, List<Pony> ponies) {
        this.userName = userName;
        this.registrationDate = registrationDate;
        this.ponies = new ArrayList<>();

        if (registrationDate.getMonthValue() == 8) {
            ponies.add(new Superpony("SzupiPony", 1,0,0));
        }
    }


    public Pony userWithTheHighestPonyExpLvl() {

        Pony highestExpLevelPony = ponies.getFirst();
        for (Pony currentPony : ponies) {
            if (currentPony.getExperienceLevel() > highestExpLevelPony.getExperienceLevel()) {
                highestExpLevelPony = currentPony;
            }
        }
        return highestExpLevelPony;

    }

    public List<Pony> poniesAtSamePosition(int x, int y) {
        List<Pony> resultPonies = new ArrayList<>();
        for (Pony currentPony : ponies) {
            if (currentPony.getPositionX() == x && currentPony.getPositionY() == y) {
                resultPonies.add(currentPony);
            }
        }
        return resultPonies;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public List<Pony> getPonies() {
        return ponies;
    }
}
