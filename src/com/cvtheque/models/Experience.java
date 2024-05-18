package com.cvtheque.models;

import com.cvtheque.patterns.composites.CVElement;

public class Experience implements CVElement {

        private String nom;
        private int dateDebut;
        private int dateFin;
        private String lieu;
        private String description;

        public Experience(String nom, int dateDebut, int dateFin, String lieu, String description) {
            this.nom = nom;
            this.dateDebut = dateDebut;
            this.dateFin = dateFin;
            this.lieu = lieu;
            this.description = description;
        }

        public String getNom() {
            return nom;
        }

        public int getDateDebut() {
            return dateDebut;
        }

        public int getDateFin() {
            return dateFin;
        }

        public String getLieu() {
            return lieu;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public void afficherDetails() {
            System.out.println("- Expérience: " + nom + " (" + dateDebut + " - " + dateFin + ") " + lieu);
            System.out.println("  Description: " + description);
        }
}
