package com.cvtheque.models;

public class Candidat extends Utilisateur {

    public Candidat(String nom, String prenom, String email) {
        super(nom, prenom, email);
    }

    @Override
    public void afficherDetails() {
        System.out.println("- Candidat: " + nom + " " + prenom + " (" + email + ")");
    }
}
