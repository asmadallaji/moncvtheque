package com.cvtheque.patterns.strategies;

import com.cvtheque.models.Experience;

import java.util.List;

public class TriParDateDebutInverse implements TriStrategy {
    @Override
    public void trier(List<Experience> experiences) {
        experiences.sort((Experience e1, Experience e2) -> {
                return -1 * e1.getDateDebut() - e2.getDateDebut();
        });
    }
}
