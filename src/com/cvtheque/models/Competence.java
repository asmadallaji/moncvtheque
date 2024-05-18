package com.cvtheque.models;

import com.cvtheque.patterns.composites.CVElement;

public class Competence implements CVElement {
	
    private String nom;
    private String niveau;
    
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	

    public Competence(String nom, String niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    @Override
    public void afficherDetails() {
        System.out.println("- Compétence: " + nom + " (Niveau: " + niveau + ")");
    }
}
