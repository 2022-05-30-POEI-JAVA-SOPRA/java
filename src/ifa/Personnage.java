package ifa;

import java.util.ArrayList;

public class Personnage {
    private String nom;
    private String prenom;

    public Personnage(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}

class SuperHeros extends Personnage{
    public SuperHeros(String nom, String prenom) {
        super(nom, prenom);
    }
}


interface IVoler{
    public void voler();
}

class SuperHerosVolant extends SuperHeros implements IVoler{

    public SuperHerosVolant(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void voler(){
        System.out.println("Je peux voler comme superman");
    }

}





class InsectGeantVolant implements IVoler{

    @Override
    public void voler() {
        System.out.println("Je peux aussi voler comme un insect");
    }
}








