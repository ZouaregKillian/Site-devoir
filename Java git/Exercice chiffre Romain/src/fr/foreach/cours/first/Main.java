package fr.foreach.cours.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier  , nous allons le convertir en chiffre romain");
        int nombre = scanner.nextInt();
        StringBuilder romain = new StringBuilder();
        while(nombre >=1000){
            nombre = nombre - 1000;
            romain.append("M");
        }
        while(nombre >=500){
            nombre = nombre - 500;
            romain.append("D");
        }
        while(nombre >=100){
            nombre = nombre - 100;
            romain.append("C");
        }
        while(nombre >= 50){
            nombre = nombre - 50;
            romain.append("L");
        }
        while(nombre >=10){
            nombre = nombre - 10;
            romain.append("X");
        }
        while(nombre >=5){
            nombre = nombre - 5;
            romain.append("V");
        }
        while(nombre >=1){
            nombre =nombre -1;
            romain.append("I");
        }
        System.out.println(romain);

    }
}
