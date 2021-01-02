package fr.foreach.cours.first;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] tableau = new int[10];
	tableau[0] = 2;
        System.out.println(Arrays.toString(tableau));
        for (int j =1; j < tableau.length; j++) {
            tableau[j] = (tableau[j - 1] * 3);
        }
        for (int j =1; j < tableau.length; j++){
            if (tableau[j] % 2 == 0){
                System.out.println(tableau[j] + " = Pair");
            }else{
                System.out.println(tableau[j] + " = Impair");
            }
        }
        tableau[5] = 4000;
        System.out.println(Arrays.toString(tableau));
        for (int j =0; j < tableau.length; j++){
            tableau[j] += 3;
        }
        System.out.println(Arrays.toString(tableau));
        }



}
