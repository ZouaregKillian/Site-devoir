package fr.foreach.cours.first;

public class TechniqueDattaque {
    int niveau;
    int numero;
    int attaqueMinimale;
    int attaqueMaximale;
    String nom;

    public TechniqueDattaque(int niveau, int numero, int attaqueMinimale,int attaqueMaximale, String nom) {
        this.niveau = niveau;
        this.numero = numero;
        this.attaqueMinimale = attaqueMinimale;
        this.attaqueMaximale = attaqueMaximale;
        this.nom = nom;


    }

    @Override
    public String toString() {
        return "Votre compétence offensive : " +
                "[" + attaqueMinimale +
                "," + attaqueMaximale +"]" +
                " nom = '" + nom + '\'' ;
    }
}
