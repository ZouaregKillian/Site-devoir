package fr.foreach.cours.first;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tableauEntier2 = {13, 18, 147, 357, 12, 565841, 74, 108, 36, 257418};
        System.out.println(Arrays.toString(tableauEntier2) + " = avant que le septième élément soit changé.");
        for(int i = 0; i< tableauEntier2.length; i++){
            if (i == 6){
                tableauEntier2[i] = 18;
            }
        }
        System.out.println(Arrays.toString(tableauEntier2));
    }
    
}
