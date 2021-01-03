package fr.foreach.cours.first;

public class Ninja {
    String nom;
    String couleur;
    String ombre;
    int besoinVitaux;
    int forme;
    int moral;
    int niveau;
    int pointDeVie;
    Amulette amulette;
    TechniqueDeDefense defense;
    TechniqueDattaque attaque;


    public Ninja(String nom, String couleur, String ombre, int besoinVitaux, int forme, int moral, int niveau,int pointDeVie, TechniqueDeDefense defense, TechniqueDattaque attaque) {
        this.nom = nom;
        this.couleur = couleur;
        this.ombre = ombre;
        this.besoinVitaux = besoinVitaux;
        this.forme = forme;
        this.moral = moral;
        this.pointDeVie = pointDeVie + niveau * 5;
        this.niveau = niveau;
        this.defense = defense;
        this.attaque = attaque;


    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getOmbre() {
        return ombre;
    }

    public void setOmbre(String ombre) {
        this.ombre = ombre;
    }

    public int getBesoinVitaux() {
        return besoinVitaux;
    }

    public void setBesoinVitaux(int besoinVitaux) {
        this.besoinVitaux = besoinVitaux;
    }

    public int getForme() {
        return forme;
    }

    public void setForme(int forme) {
        this.forme = forme;
    }

    public int getMoral() {
        return moral;
    }

    public void setMoral(int moral) {
        this.moral = moral;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public Amulette getAmulette() {
        return amulette;
    }

    public void setAmulette(Amulette amulette) {
        this.amulette = amulette;
    }

    public TechniqueDeDefense getDefense() {
        return defense;
    }

    public void setDefense(TechniqueDeDefense defense) {
        this.defense = defense;
    }

    public TechniqueDattaque getAttaque() {
        return attaque;
    }

    public void setAttaque(TechniqueDattaque attaque) {
        this.attaque = attaque;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nom='" + nom + '\'' +
                ", couleur='" + couleur + '\'' +
                ", ombre='" + ombre + '\'' +
                ", besoinVitaux=" + besoinVitaux +
                ", forme=" + forme +
                ", moral=" + moral +
                ", niveau=" + niveau +
                ", pointDeVie=" + pointDeVie +
                ", amulette=" + amulette +
                ", defense=" + defense +
                ", attaque=" + attaque +
                '}';
    }
}
