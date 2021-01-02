package fr.foreach.cours.first;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrez la taille du tableau");
        int tailleTableau = scanner.nextInt();
        if (tailleTableau % 2 == 0){
            tailleTableau += 1;
        }
        int[] tableauCourant = new int[tailleTableau];
        int[] tableauFutur = new int [tailleTableau];
        for (int i =0; i < tableauCourant.length; i++){
            if (i + 0.5== (float)tableauCourant.length / 2){
                tableauCourant[i] = 1;
            }else{
                tableauCourant[i] =0;
            }
        }
        for (int k =1; k <= 15;k++){
            System.out.println(Arrays.toString(tableauCourant));
            for (int j= 1; j < tableauCourant.length - 1; j++) {

                    if (tableauCourant[j - 1] == 1 && tableauCourant[j + 1] == 0) {
                        tableauFutur[j] = 1;


                    }else if (tableauCourant[j - 1] == 1 && tableauCourant[j + 1] == 1){
                        tableauFutur[j] = 1;


                    }else if (tableauCourant[j - 1] == 0 && tableauCourant[j + 1] == 1){
                        tableauFutur[j] = 1;


                    }else if (tableauCourant[j - 1] == 0 && tableauCourant[j + 1] == 0) {
                        if (tableauCourant[j] == 1) {
                            tableauFutur[j] = 1;
                        } else if(tableauCourant[j] == 0){
                            tableauFutur[j] = 0;
                        }
                    }
            }for (int h = 0; h < tableauCourant.length; h++ ){
                tableauCourant[h] = tableauFutur[h];
            }
        }
    }
}