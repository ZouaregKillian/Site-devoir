package fr.foreach.cours.first;

public class Main {

    public static void main(String[] args) {
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] alphabetReverse = new char [26];
        for(int pair =25; pair >= 0 ; pair--){
            alphabetReverse[25-pair] = alphabet [pair];
        }
        System.out.println(alphabet);
        System.out.println(alphabetReverse);
    }

}
