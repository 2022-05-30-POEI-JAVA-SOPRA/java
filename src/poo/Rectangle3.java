package poo;

public class Rectangle3 {
    private double longueur;
    private double largeur;

    // Surchage : La possiblité d'avoir au sein d'une classe plusieurs méthodes
    // Avec le même nom, mais différentes signatures
    public Rectangle3(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }

    public Rectangle3(){
        longueur=10;
        largeur=5;
    }

    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }

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

    public String toString(){
        return String.format("[ Longueur : %f\nLargeur : %f\nSurface : %f\nPerimètre %f" +
                        " ]",
                this.longueur,this.largeur,this.calculDeLaSurface(),this.calculDuPerimetre());
    }
}
