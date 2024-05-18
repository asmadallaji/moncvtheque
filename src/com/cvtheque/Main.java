package com.cvtheque;

import com.cvtheque.models.CV;

import com.cvtheque.models.Candidat;
import com.cvtheque.patterns.builder.CVBuilder;
import com.cvtheque.patterns.composites.CVElement;
import com.cvtheque.patterns.decorator.CVWithContact;
import com.cvtheque.patterns.factory.UtilisateurFactory;
import com.cvtheque.patterns.singleton.BaseDeDonneesSimulee;
import com.cvtheque.utils.Couleurs;

import java.util.List;
import java.util.Scanner;

import com.cvtheque.dao.DAO;
import com.cvtheque.dao.factoryDao;

public class Main {/*
    public static void main(String[] args) {
        System.out.println(Couleurs.GREEN + "Bienvenue dans l'application CVthèque!" + Couleurs.RESET);

        System.out.println(Couleurs.BLUE + "Exemple d'utilisation de pattern factory :" + Couleurs.RESET);

        Candidat candidat = (Candidat) UtilisateurFactory.getUtilisateur("Candidat", "Dupont", "Jean", "dupont.jean@mailbox.com");

        System.out.println(Couleurs.BLUE + "Exemple d'utilisation de pattern composite et builder:" + Couleurs.RESET);

        CV cv = creerCv();

        System.out.println(Couleurs.CYAN + "Affichage du CV:" + Couleurs.RESET);

        cv.afficherDetails();


        System.out.println(Couleurs.BLUE +  "Exemple d'utilisation de pattern decorator :" + Couleurs.RESET);

        CVWithContact cvWithContact = new CVWithContact(cv, candidat);

        System.out.println(Couleurs.CYAN + "Affichage du CV avec les informations de contact du candidat:" + Couleurs.RESET);

        cvWithContact.afficherDetails();


        System.out.println(Couleurs.BLUE + "Exemple d'utilisation de pattern Strategy qui trie les expériences par duréée :");

        cv.setTriStrategy(new TriParDuree());

        cv.trierExperiences();

        System.out.println(Couleurs.CYAN + "Affichage du CV avec les expériences triées par date debut :" + Couleurs.RESET);

        cv.afficherDetails();

        cv.setTriStrategy(new TriParDateDebut());

        cv.trierExperiences();

        System.out.println(Couleurs.CYAN + "Affichage du CV avec les expériences triées par date de debut :" + Couleurs.RESET);

        cv.afficherDetails();

        cv.setTriStrategy(new TriParDateDebutInverse());

        cv.trierExperiences();

        System.out.println(Couleurs.CYAN + "Affichage du CV avec les expériences triées par date de debut inversé :" + Couleurs.RESET);

        cv.afficherDetails();
    }*/


    public static void main(String[] args) {
    	
    	DAO<Candidat> userDao = factoryDao.createDAO(Candidat.class);
        /*System.out.println(Couleurs.GREEN + "Bienvenue dans l'application CVthèque!" + Couleurs.RESET);

        Scanner scanner = new Scanner(System.in);
        int choixPrincipal;

        while (true) {
            System.out.println("\n--- Menu Principal CVthèque ---");
            System.out.println("1. Gestion des Candidats");
            System.out.println("2. Gestion des CVs");
            System.out.println("3. Quitter");
            System.out.print("Entrez votre choix : ");
            choixPrincipal = scanner.nextInt();

            switch (choixPrincipal) {
                case 1:
                    gestionCandidats();
                    break;
                case 2:
                    gestionCVs();
                    break;
                case 3:
                    System.out.println("Quitter...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }*/
    }

    private static void gestionCandidats() {
        Scanner scanner = new Scanner(System.in);
        int choixGestionCandidats;

        while (true) {
            System.out.println("\n--- Gestion des Candidats ---");
            System.out.println("1. Ajouter un Candidat");
            System.out.println("2. Afficher les Candidats");
            System.out.println("3. Retour");
            System.out.print("Entrez votre choix : ");
            choixGestionCandidats = scanner.nextInt();

            switch (choixGestionCandidats) {
                case 1:
                    ajouterCandidat();
                    break;
                case 2:
                    afficherCandidats();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

    private static void ajouterCandidat() {
        Scanner scanner = new Scanner(System.in);
        String nom, prenom, email;

        System.out.println("\n--- Ajouter un Candidat ---");
        System.out.print("Nom : ");
        nom = scanner.nextLine();
        System.out.print("Prenom : ");
        prenom = scanner.nextLine();
        System.out.print("Email : ");
        email = scanner.nextLine();

        Candidat candidat = (Candidat) UtilisateurFactory.getUtilisateur("Candidat", nom, prenom, email);
        BaseDeDonneesSimulee.getInstance().ajouterCandidat(candidat);
    }

    private static void afficherCandidats() {
        System.out.println("\n--- Afficher les Candidats ---");
        int i = 1;
        for (Candidat candidat : BaseDeDonneesSimulee.getInstance().getCandidats()) {
            System.out.println(Couleurs.MAGENTA + "-------------- Candidat " + i++ + ": -------------- " + Couleurs.RESET);
            candidat.afficherDetails();
        }
    }

    private static void gestionCVs() {
        Scanner scanner = new Scanner(System.in);
        int choixGestionCVs;

        while (true) {
            System.out.println("\n--- Gestion des CVs ---");
            System.out.println("1. Ajouter un CV");
            System.out.println("2. Afficher les CVs");
            System.out.println("3. Retour");
            System.out.print("Entrez votre choix : ");
            choixGestionCVs = scanner.nextInt();

            switch (choixGestionCVs) {
                case 1:
                    ajouterCV();
                    break;
                case 2:
                    afficherCVs();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

    private static void afficherCVs() {
        System.out.println("\n--- Afficher les CVs ---");
        int i = 1;
        for (CVElement cv : BaseDeDonneesSimulee.getInstance().getCVs()) {
            System.out.println(Couleurs.MAGENTA + "-------------- CV " + i++ + ": -------------- " + Couleurs.RESET);
            cv.afficherDetails();
        }
    }

    private static void ajouterCV() {
        Scanner scanner = new Scanner(System.in);
        CVBuilder cvBuilder = new CVBuilder();

        System.out.println("Création d'un nouveau CV");

        // Ajouter des compétences
        ajouterCompetences(scanner, cvBuilder);

        // Ajouter des formations
        ajouterFormations(scanner, cvBuilder);

        // Ajouter des expériences
        ajouterExperiences(scanner, cvBuilder);

        CVElement cv = cvBuilder.build();

        System.out.println("Voulez-vous décorer ce CV avec les informations d'un candidat? (o/N)");
        if (scanner.nextLine().equalsIgnoreCase("o")) {
            cv = decorerCvAvecCandidat(cv);
        }


        BaseDeDonneesSimulee.getInstance().ajouterCV(cv);
    }

    private static void ajouterCompetences(Scanner scanner, CVBuilder cvBuilder) {
        while (true) {
            System.out.println("Voulez-vous ajouter une compétence? (o/N)");
            if (!scanner.nextLine().equalsIgnoreCase("o")) {
                break;
            }
            System.out.print("Entrez la compétence : ");
            String competence = scanner.nextLine();
            System.out.print("Entrez le niveau : ");
            String niveau = scanner.nextLine();
            cvBuilder.ajouterCompetence(competence, niveau);
        }
    }

    private static void ajouterFormations(Scanner scanner, CVBuilder cvBuilder) {
        while (true) {
            System.out.println("Voulez-vous ajouter une formation? (o/N)");
            if (!scanner.nextLine().equalsIgnoreCase("o")) {
                break;
            }
            System.out.print("Entrez l'intitulé de la formation : ");
            String intitule = scanner.nextLine();
            System.out.print("Entrez l'année de début : ");
            int anneeDebut = scanner.nextInt();
            System.out.print("Entrez l'année de fin : ");
            int anneeFin = scanner.nextInt(); scanner.nextLine(); // Consume newline
            System.out.print("Entrez l'établissement : ");
            String etablissement = scanner.nextLine();
            System.out.print("Entrez la description de la formation : ");
            String description = scanner.nextLine();
            cvBuilder.ajouterFormation(intitule, anneeDebut, anneeFin, etablissement, description);
        }
    }

    private static void ajouterExperiences(Scanner scanner, CVBuilder cvBuilder) {
        while (true) {
            System.out.println("Voulez-vous ajouter une expérience? (o/N)");
            if (!scanner.nextLine().equalsIgnoreCase("o")) {
                break;
            }
            System.out.print("Entrez l'intitulé de l'expérience : ");
            String intitule = scanner.nextLine();
            System.out.print("Entrez l'année de début : ");
            int anneeDebut = scanner.nextInt();
            System.out.print("Entrez l'année de fin : ");
            int anneeFin = scanner.nextInt(); scanner.nextLine(); // Consume newline
            System.out.print("Entrez le nom de l'entreprise : ");
            String entreprise = scanner.nextLine();
            System.out.print("Entrez la description de l'expérience : ");
            String description = scanner.nextLine();
            cvBuilder.ajouterExperience(intitule, anneeDebut, anneeFin, entreprise, description);
        }
    }

    private static CVElement decorerCvAvecCandidat(CVElement cv) {
        List<Candidat> candidats = BaseDeDonneesSimulee.getInstance().getCandidats();
        if (candidats.isEmpty()) {
            System.out.println("Aucun candidat disponible pour décorer le CV.");
            return cv;
        }

        System.out.println("Sélectionnez un candidat pour décorer le CV:");
        for (int i = 0; i < candidats.size(); i++) {
            Candidat candidat = candidats.get(i);
            System.out.println((i + 1) + ". " + candidat.getNom() + " " + candidat.getPrenom());
        }

        Scanner scanner = new Scanner(System.in);

        int choix = scanner.nextInt(); scanner.nextLine(); // Consume newline
        Candidat candidatChoisi = candidats.get(choix - 1);

        return new CVWithContact(cv, candidatChoisi);
    }
}