package fr.foreach.cours.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double prixTotal = 0;
        Scanner scanner = new Scanner(System.in);
        boolean bouclePlat = true;
        boolean boucleDessert = true;
        boolean boucleBoisson = true;
        System.out.println("Bienvenue sur ForEats");
        while (bouclePlat) {
            System.out.println("Voulez vous (re)prendre un plat  OUI [1] / NON[2]?");
            int plat = scanner.nextInt();
            if (plat == 1) {
                System.out.println("[1]-----Pavé de saumon sauce au beurre d'agrumes 8.95€");
                System.out.println("[2]-----Jarret d'agneau à l'ail et au thym 10.95€");
                System.out.println("[3]-----Poêlée de légumes du moment 2.95€");
                System.out.println("Entrez le chiffre correspondant au plat que vous shouaitez:");
                int platChoix = scanner.nextInt();
                if (platChoix == 1) {
                    prixTotal = prixTotal + 8.95;
                }else if(platChoix == 2){
                    prixTotal = prixTotal + 10.95;
                }else{
                    prixTotal = prixTotal + 2.95;
                }
            }else if (plat == 2){
                bouclePlat = false;
            }
        }
        System.out.println("Le montant de votre panier est de = " +(double)Math.round(prixTotal * 100000) / 100000);
        while (boucleDessert) {
            System.out.println("Voulez vous (re)prendre un dessert  OUI [1] / NON[2]?");
            int dessert = scanner.nextInt();
            if (dessert == 1) {
                System.out.println("[1]-----Craquant meringué au chocolat 3.95€");
                System.out.println("[2]-----Fromage blanc aux fruits 2.50€");
                System.out.println("[3]-----Tartelette crémeuse aux fruits 2.50€");
                System.out.println("Entrez le chiffre correspondant au dessert que vous shouaitez:");
                int dessertChoix = scanner.nextInt();
                if (dessertChoix == 1) {
                    prixTotal = prixTotal + 8.95;
                }else if(dessertChoix == 2){
                    prixTotal = prixTotal + 10.95;
                }else{
                    prixTotal = prixTotal + 2.95;
                }
            }else if (dessert == 2){
                boucleDessert = false;
            }
        }
        System.out.println("Le montant de votre panier est de = " + (double)Math.round(prixTotal * 100000) / 100000);
        while (boucleBoisson) {
            System.out.println("Voulez vous (re)prendre une boisson OUI [1] / NON[2]?");
            int boisson = scanner.nextInt();
            if (boisson == 1) {
                System.out.println("[1]-----Jus d'ananas 1L 3.0 €");
                System.out.println("[2]-----San pellegrino 50cl 1.95€");
                System.out.println("[3]-----AOC Buzet Petit Baron vin blanc 75cl 8.95€");
                System.out.println("Entrez le chiffre correspondant a la boisson que vous shouaitez:");
                int boissonChoix = scanner.nextInt();
                if (boissonChoix == 1) {
                    prixTotal = prixTotal + 8.95;
                }else if(boissonChoix == 2){
                    prixTotal = prixTotal + 10.95;
                }else{
                    prixTotal = prixTotal + 2.95;
                }
            }else if (boisson == 2){
                boucleBoisson = false;
            }
        }
        System.out.println("Le montant de votre panier est de = " + ((double)Math.round(prixTotal * 100000) / 100000));
        System.out.println("Merci de nous faire confiance chez ForEats et bon appétit ! ");
    }
}