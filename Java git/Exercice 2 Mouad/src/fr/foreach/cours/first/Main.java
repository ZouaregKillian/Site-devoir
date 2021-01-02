package fr.foreach.cours.first;

public class Main {

    public static void main(String[] args) {
        int[] tableauEntier = {3, 18, 77, 5347, 26, 41, 36, 78, 988, 3547};
        for (int j : tableauEntier) {
            if (j % 2 == 0) {
                System.out.println(j + " = Pair");
            } else {
                System.out.println(j + " = Impair");
            }
        }
    }
}
