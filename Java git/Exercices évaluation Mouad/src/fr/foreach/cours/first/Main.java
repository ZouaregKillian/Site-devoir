package fr.foreach.cours.first;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("EXERCICE 1");
		System.out.println("----------");
	int[] tableauEntier = {3, 18, 77, 5347, 26, 41, 36, 78, 988, 3547};
	int minimum = 9999;
	int maximum = 0;

		for (int j : tableauEntier) {
			if (j < minimum) {
				minimum = j;
			}
		}
		for (int i : tableauEntier) {
			if (i > maximum) {
				maximum = i;
			}
		}
	System.out.println(minimum);
	System.out.println(maximum);

		System.out.println("EXERCICE 2");
		System.out.println("----------");
		for (int j : tableauEntier) {
			if (j % 2 == 0) {
				System.out.println(j + " = Pair");
			} else {
				System.out.println(j + " = Impair");
			}
		}
		System.out.println("EXERCICE 3");
		System.out.println("----------");

		int entierSaisi;
		int indexSaisi;
		System.out.println("Voici le tableau avant transformation");
		System.out.println(Arrays.toString(tableauEntier));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier");
		entierSaisi = scanner.nextInt();
		System.out.println("Veuillez saisir un index");
		indexSaisi = scanner.nextInt();

		if (indexSaisi >= 0 && indexSaisi < tableauEntier.length){
			tableauEntier[indexSaisi] = entierSaisi;
			System.out.println("Voici le tableau post transformation");
			System.out.println(Arrays.toString(tableauEntier));
		}else{
			System.out.println("Erreur ! L'index choisis est trop grand");
			System.out.println("Veuillez relancer le programme");
		}

		System.out.println("EXERCICE 4a");
		System.out.println("----------");

		int[] tableauEntier2 = {13, 18, 147, 357, 12, 565841, 74, 108, 36, 257418};
		System.out.println(Arrays.toString(tableauEntier2) + " = avant que le septième élément soit changé.");
		for(int i = 0; i< tableauEntier2.length; i++){
			if (i == 6){
				tableauEntier2[i] = 18;
			}
		}
		System.out.println(Arrays.toString(tableauEntier2) + "");

		System.out.println("EXERCICE 4b");
		System.out.println("----------");

		int[] tableauEntier3 = {13, 18, 147, 357, 12, 565841, 74, 108, 36, 147};
		int entierSaisiExercice5;
		String phrase1="";
		String phrase2="";
		System.out.println(Arrays.toString(tableauEntier3));
		System.out.println("Veuillez saisir un entier");
		entierSaisiExercice5 = scanner.nextInt();
		for (int j = 0; j< tableauEntier3.length; j ++) {
			if (entierSaisiExercice5 == tableauEntier3[j]){
				phrase1 =("L'index appartenant à " + entierSaisiExercice5 + " est :" + j);
				phrase2 =("Et c'est le " + (j + 1) + "ème élément du tableau");
			}
		}
		if (phrase1.equals("")){
			System.out.println("L'entier choisis n'apparaît pas dans le tableau");
		}
		System.out.println(phrase1);
		System.out.println(phrase2);


		System.out.println("EXERCICE 4C");
		System.out.println("-----------");

		int[] tableauEntier2Exercice4c = {13, 18, 147, 357, 12, 147, 74, 108, 36, 147}; // Pour tester la contrainte de l'occurence
		int entierSaisiExercice4c;                                                      // Entrez l'entier 147
		String phrase1Exercice4c="";
		String phrase2Exercice4c="";
		System.out.println(Arrays.toString(tableauEntier2Exercice4c));
		System.out.println("Veuillez saisir un entier");
		entierSaisiExercice4c = scanner.nextInt();
		for (int j = 0; j< tableauEntier2Exercice4c.length; j ++) {
			if (entierSaisiExercice4c == tableauEntier2Exercice4c[j]){
				phrase1Exercice4c =("L'index appartenant à " + entierSaisiExercice4c + " est :" + j);
				phrase2Exercice4c =("Et c'est le " + (j + 1) + "ème élément du tableau");
				break;
			}
		}
		if (phrase1.equals("")){
			System.out.println("L'entier choisis n'apparaît pas dans le tableau");
		}
		System.out.println(phrase1Exercice4c);
		System.out.println(phrase2Exercice4c);
	}
}
