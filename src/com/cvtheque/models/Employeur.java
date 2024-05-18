package com.cvtheque.models;

public class Employeur extends Utilisateur {
    public Employeur(String nom, String prenom, String email) {
        super(nom, prenom, email);
    }

    @Override
    public void afficherDetails() {
        System.out.println("- Employeur: " + nom + " " + prenom + " (" + email + ")");
    }
}
