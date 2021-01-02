package fr.foreach.cours.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] liste = new String[15];
        System.out.println("Qui sera l'heureux élu ?");
        Scanner scanner = new Scanner(System.in);
        boolean saisieFini = false;
        String eleveChoisis ="";
        int compteur = 0;
        while (!saisieFini){
            System.out.println("Ajoutez un prenom [1]/Finir la saisie [2]");
            int choix1 = scanner.nextInt();
            if (choix1 ==1){
                System.out.println("Veuillez saisir un prenom");
                String prenom = scanner.next();
                liste[compteur] = prenom;
                compteur = compteur + 1;
            }else if (choix1 == 2){
                System.out.println("Vous avez fini de saisir les prenoms");
                saisieFini = true;
            }else{
                System.out.println("Tapez 1 ou 2, merci !");
            }
        }
        eleveChoisis = liste[(int) (Math.random() * liste.length)];
        while(eleveChoisis == null){
            eleveChoisis = liste[(int) (Math.random() * liste.length)];
        }
        System.out.println(eleveChoisis);
    }
}
