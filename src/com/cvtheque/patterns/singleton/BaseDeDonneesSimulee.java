package com.cvtheque.patterns.singleton;

import com.cvtheque.models.Candidat;
import com.cvtheque.patterns.composites.CVElement;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDonneesSimulee {
    // Instance unique de la classe
    private static BaseDeDonneesSimulee instance = new BaseDeDonneesSimulee();

    // Listes pour simuler le stockage des données
    private List<Candidat> candidats;
    private List<CVElement> cvs;

    // Constructeur privé pour empêcher l'instanciation extérieure
    private BaseDeDonneesSimulee() {
        candidats = new ArrayList<>();
        cvs = new ArrayList<>();
    }

    // Méthode statique pour obtenir l'instance unique
    public static BaseDeDonneesSimulee getInstance() {
        return instance;
    }

    // Méthodes pour manipuler les candidats
    public void ajouterCandidat(Candidat candidat) {
        candidats.add(candidat);
    }

    public List<Candidat> getCandidats() {
        return candidats;
    }

    // Méthodes pour manipuler les CVs
    public void ajouterCV(CVElement cv) {
        cvs.add(cv);
    }

    public List<CVElement> getCVs() {
        return cvs;
    }
}
