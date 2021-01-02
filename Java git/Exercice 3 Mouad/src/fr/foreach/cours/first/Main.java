package fr.foreach.cours.first;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] tableauEntier = {3, 18, 77, 5347, 26, 41, 36, 78, 988, 3547};
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

    }
}
