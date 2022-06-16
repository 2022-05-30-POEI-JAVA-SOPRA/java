package bases_java;

public class Variables {
    public static void main(String[] args) {
        //Les variables/fonctions en Java sont en camelCase
        //Les classes vont etre en PascalCase

        //Les entiers
        byte age=18;
        //calcul Rectangle
        int longueur=50;
        int largeur=25;
        int surface=longueur*largeur;
        int perimetre=2*(longueur+largeur);
        System.out.println(surface);
        System.out.println(perimetre);


        // Reels
        //Calcul de la vitesse moyenne en MRU
        float distanceParcourue=90.6F;
        float temps=12.354F;
        double vitesseMoyenne=distanceParcourue/temps;
        double vitesseMoyenne2=56.45;
        //calcul somme des nombres
        float prix=150.5F;

        // Chaine de caracteres et caracters
        String prenom="Christian";//chaine de caracteres
        char genre='M';

        //35.55589587876546857964 : double
        //35.6 : float
    }
}

/*
*   x = 1200
*   t = 45
*   v = x/t
*   v = ? 26.6
*   t = 80
*   v : 26.6
* */
