package org.example;

import org.example.ponyType.Superpony;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private LocalDate registrationDate;
    private List<Pony> ponies;
    private final static int AUGUST_NUMBER = 8;

    public User(String userName, LocalDate registrationDate) {
        this.userName = userName;
        this.registrationDate = registrationDate;
        this.ponies = new ArrayList<>();

        if (registrationDate.getMonthValue() == AUGUST_NUMBER) {
            ponies.add(new Superpony("SzupiPony", 1,0,0));
        }
    }

    public Pony getHighestExpPony() {
        if (ponies.isEmpty()) {
            return null;
        }
        Pony highestExpPony = ponies.getFirst();
        for (Pony pony : ponies) {
            if (pony.getExperienceLevel() > highestExpPony.getExperienceLevel()) {
                highestExpPony = pony;
            }
        }
        return highestExpPony;
    }

    public List<Pony> getPoniesWithSamePosition(int x, int y) {
        List<Pony> resultPonies = new ArrayList<>();
        for (Pony pony : ponies) {
            if (pony.getPositionX() == x && pony.getPositionY() == y) {
                resultPonies.add(pony);
            }
        }
        return resultPonies;
    }

}
