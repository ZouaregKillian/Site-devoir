package fr.foreach.cours.first;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Object String;

    public static void main(String[] args) {
        int[] tableauEntier2 = {13, 18, 147, 357, 12, 147, 74, 108, 36, 147}; // Pour tester la contrainte de l'occurence
        int entierSaisi;                                                      // Entrez l'entier 147
        String phrase1="";
        String phrase2="";
        System.out.println(Arrays.toString(tableauEntier2));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        entierSaisi = scanner.nextInt();
        for (int j = 0; j< tableauEntier2.length; j ++) {
            if (entierSaisi == tableauEntier2[j]){
                phrase1 =("L'index appartenant à " + entierSaisi + " est :" + j);
                phrase2 =("Et c'est le " + (j + 1) + "ème élément du tableau");
                break;
            }
        }
        if (phrase1.equals("")){
            System.out.println("L'entier choisis n'apparaît pas dans le tableau");
        }
        System.out.println(phrase1);
        System.out.println(phrase2);
    }
}