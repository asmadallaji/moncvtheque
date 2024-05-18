package com.cvtheque.patterns.decorator;

import com.cvtheque.models.CV;
import com.cvtheque.models.Candidat;
import com.cvtheque.patterns.composites.CVElement;
import com.cvtheque.utils.Couleurs;

public class CVWithContact extends CVDecorator {
    private final Candidat candidat;

    public CVWithContact(CVElement cv, Candidat candidat) {
        super(cv);
        this.candidat = candidat;
    }

    public void afficherDetails() {
        System.out.println(Couleurs.MAGENTA + "-- Informations de condidat:" + Couleurs.RESET);
        candidat.afficherDetails();
        System.out.println(Couleurs.MAGENTA + "-- Contenue:" + Couleurs.RESET);
        super.afficherDetails();
    }
}
