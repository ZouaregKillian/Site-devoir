package fr.foreach.cours.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int grand = 0;
	    int[] tableau = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saissisez un nombre");
        tableau[0] = scanner.nextInt();
        System.out.println("Saissisez un nombre");
        tableau[1] = scanner.nextInt();
        System.out.println("Saissisez un nombre");
        tableau[2] = scanner.nextInt();
        System.out.println("Saissisez un nombre");
        tableau[3] = scanner.nextInt();

        for (int i =0 ; i<= tableau.length;i++){
            if(tableau[i]>grand){
                grand =tableau[i];
            }
        }
        System.out.println(grand);
    }
}
