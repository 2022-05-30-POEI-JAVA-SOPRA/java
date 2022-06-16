package poo;


//Quand on ne fournit un constructeur
// Le compilateur Java invoque un constructeur spécial appelé
// "Le constructeur par défaut par défaut"

public class Rectangle2 {
    private double longueur;
    private double largeur;

    //Accesseurs ou Getter : Ce sont des méthodes qui nous donnent un accès en lecture
    // aux membres ou attributs privés
    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }

    //Manipulateurs ou setters : Ce sont des méthodes qui nous donnent la possibilité
    // de modifier des attributs privés

    // this dans cette situation nous permet d'éviter la shadowing(masquage)
    // Le shadowing est fait qu'un paramètre de fonction empeche la fonction ou méthode
    // de voir l'attribut ayant le même nom
    public void setLongueur(double longueur){
       this.longueur=longueur;
    }

    public void setLargeur(double largeur){
        this.largeur=largeur;
    }


    double calculDeLaSurface(){
        return longueur*largeur;
    }

    double calculDuPerimetre(){
        return 2*(longueur+largeur);
    }
}
