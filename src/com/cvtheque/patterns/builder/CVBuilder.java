package com.cvtheque.patterns.builder;

import com.cvtheque.models.CV;
import com.cvtheque.models.Competence;
import com.cvtheque.models.Experience;
import com.cvtheque.models.Formation;

public class CVBuilder {
    private CV cv;

    public CVBuilder() {
        cv = new CV();
    }

    public CVBuilder ajouterCompetence(String nom, String niveau) {
        cv.addCompetence(new Competence(nom, niveau));
        return this;
    }

    public CVBuilder ajouterExperience(String nom, int dateDebut, int dateFin, String lieu, String description) {
        cv.addExperience(new Experience(nom, dateDebut, dateFin, lieu, description));
        return this;
    }

    public CVBuilder ajouterFormation(String nom, int dateDebut, int dateFin, String lieu, String description) {
        cv.addFormation(new Formation(nom, dateDebut, dateFin, lieu, description));
        return this;
    }

    public CV build() {
        return cv;
    }
}