package com.cvtheque.models;

import com.cvtheque.patterns.composites.CVElement;
import com.cvtheque.patterns.strategies.TriStrategy;
import com.cvtheque.utils.Couleurs;

import java.util.ArrayList;
import java.util.List;


public class CV implements CVElement  {

    private List<Competence> competences;
    private List<Experience> experiences;
    private List<Formation> formations;
    private TriStrategy triStrategy;
    private String centreInteret;

    public CV() {
        competences = new ArrayList<>();
        experiences = new ArrayList<>();
        formations = new ArrayList<>();
    }

    public void addCompetence(Competence competence) {
        competences.add(competence);
    }

    public void addExperience(Experience experience) {
        experiences.add(experience);
    }

    public void addFormation(Formation formation) {
        formations.add(formation);
    }

    @Override
    public void afficherDetails() {
        System.out.println(Couleurs.YELLOW +  " --- Formations --- " + Couleurs.RESET);
        this.afficherDetailsElement(formations);
        System.out.println(Couleurs.RED + " --- Experiences --- " + Couleurs.RESET);
        this.afficherDetailsElement(experiences);
        System.out.println(Couleurs.GREEN + " --- Competences --- " + Couleurs.RESET);
        this.afficherDetailsElement(competences);
    }

    private void afficherDetailsElement(List<? extends CVElement> elements) {
        for (CVElement element : elements) {
            element.afficherDetails();
        }
    }

    public void setTriStrategy(TriStrategy triStrategy) {
        this.triStrategy = triStrategy;
    }

    public void trierExperiences() {
        triStrategy.trier(experiences);
    }

	public String getCentreInteret() {
		return centreInteret;
	}

	public void setCentreInteret(String centreInteret) {
		this.centreInteret = centreInteret;
	}
}
