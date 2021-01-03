package fr.foreach.cours.first;

import java.util.List;

public class TechniqueDeDefense {
    int niveau;
    int numero;
    int defenseMinimale;
    int defenseMaximale;
    String nom;

    public TechniqueDeDefense(int niveau, int numero, int defenseMinimale, int defenseMaximale, String nom) {
        this.niveau = niveau;
        this.numero = numero;
        this.defenseMinimale = defenseMinimale;
        this.defenseMaximale = defenseMaximale;
        this.nom = nom;
    }


    @Override
    public String toString() {
        return "Votre compétence de défense : " +
                "[" + defenseMinimale +
                 "," + defenseMaximale +"]" +
                " nom = '" + nom + '\'' ;
    }
}
