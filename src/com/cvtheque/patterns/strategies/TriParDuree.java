package com.cvtheque.patterns.strategies;

import com.cvtheque.models.Experience;

import java.util.Collections;
import java.util.List;

public class TriParDuree implements TriStrategy {
    @Override
    public void trier(List<Experience> experiences) {
        experiences.sort((Experience e1, Experience e2) -> {
            int duree1 = e1.getDateFin() - e1.getDateDebut();
            int duree2 = e2.getDateFin() - e2.getDateDebut();
            return duree1 - duree2;
        });
    }
}
