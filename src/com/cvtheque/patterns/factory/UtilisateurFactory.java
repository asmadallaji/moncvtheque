package com.cvtheque.patterns.factory;

import com.cvtheque.models.Candidat;
import com.cvtheque.models.Employeur;
import com.cvtheque.models.Utilisateur;

public class UtilisateurFactory {
    public static Utilisateur getUtilisateur(String type, String nom, String prenom, String email) {
        if (type.equalsIgnoreCase("Candidat")) {
            return new Candidat(nom, prenom, email);
        } else if (type.equalsIgnoreCase("Employeur")) {
            return new Employeur(nom, prenom, email);
        }
        return null;
    }
}

