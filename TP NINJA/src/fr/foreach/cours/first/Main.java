package fr.foreach.cours.first;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TechniqueDeDefense esquive = new TechniqueDeDefense(0, 1, 0, 2, "Esquive");
        TechniqueDeDefense garde = new TechniqueDeDefense(0, 2, 0, 3, "Garde");
        TechniqueDeDefense pasChasse = new TechniqueDeDefense(0, 3, 1, 1, "Pas Chassé");

        TechniqueDattaque coupDePoing = new TechniqueDattaque(0, 1, 0, 2, "coup de poing");
        TechniqueDattaque coupDePied = new TechniqueDattaque(0, 2, 0, 3, "Coup de pied");
        TechniqueDattaque coupDeTete = new TechniqueDattaque(0, 3, 1, 1, "Coup de tête");


        List<TechniqueDeDefense> listeDefenseAleatoireDebut = Arrays.asList(esquive, garde, pasChasse);
        TechniqueDeDefense defenseDebut = listeDefenseAleatoireDebut.get((int) (Math.random() * 3));


        List<TechniqueDattaque> listeAttaqueAleatoireDebut = Arrays.asList(coupDePoing, coupDePied, coupDeTete);
        TechniqueDattaque attaqueDebut = listeAttaqueAleatoireDebut.get((int) (Math.random() * 3));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez choisir un nom pour votre Ninja");
        String nomNinja = scanner.nextLine();
        System.out.println("Veuillez choisir une couleur pour votre Ninja");
        String couleurNinja = scanner.nextLine();

        Ninja ninja = new Ninja(nomNinja, couleurNinja, "ombre.jpeg", 100, 100, 100, 0, 15, defenseDebut, attaqueDebut);
        System.out.println(ninja);


        System.out.println("Voulez vous combattre un autre Ninja[1] ou alors voir vos compétences[2] ?");
        int action = scanner.nextInt();
        if (action == 2) {
            System.out.println("Voici vos compétences : ");
            System.out.println(defenseDebut);
            System.out.println(attaqueDebut);
            System.out.println("Entrez [1] quand vous serez prêt à affronter un ennemi");
            int continuer = scanner.nextInt();
        }

        ninja.forme -= 30;
        System.out.println("Vos points de forme restants:" + ninja.forme);

        List<TechniqueDeDefense> listeDefenseAleatoire = Arrays.asList(esquive, garde, pasChasse);
        TechniqueDeDefense defenseAleatoire = listeDefenseAleatoire.get((int) (Math.random() * 3));


        List<TechniqueDattaque> listeAttaqueAleatoire = Arrays.asList(coupDePoing, coupDePied, coupDeTete);
        TechniqueDattaque attaqueAleatoire = listeAttaqueAleatoire.get((int) (Math.random() * 3));

        Ninja ennemi = new Ninja("Ninja ennemi", "Noir", "Ombre menaçente", 100, (int) (Math.random() * 101), 100, (int) (Math.random() * 2),15, defenseAleatoire, attaqueAleatoire);
        System.out.println("Voici votre ennemi :" + ennemi);

        int tirageAuSort;

        if (ennemi.forme > ninja.forme) {
            tirageAuSort = 1;
            System.out.println("L'ennemi commence le combat !");
        } else {
            tirageAuSort = 2;
            System.out.println("Vous commencez le combat !");
        }
        boolean combatFini = false;

    }
}
