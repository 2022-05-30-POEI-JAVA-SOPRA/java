package approche_procedurale;

public class ProgrammationProcedurale {
    //Requirement pour calculer le perimetre d'un rectangle
    // Connaitre la longueur et la largeur
    // Connaitre le type de données pour les 2 dimensions
    // Connaitre le type de donnée qui sera produit à l'issue du traitement

    static float calculDuPerimetre(float longueur,float largeur){
        float perimetre=(longueur+largeur)*2;
        return perimetre;
    }

    static float calculDeLaSurface(float longueur,float largeur){
        return longueur*largeur;
    }


    public static void main(String[] args) {
        float poids=5.6f;
        float prixUHT=78.4f;
        //Rectangle 1
        float longueur=500.5F;
        float largeur=250F;

        float surface=calculDeLaSurface(poids,prixUHT);
        float perimetre=calculDuPerimetre(longueur,largeur);

        System.out.printf("Surface 1 : %f\nPerimetre 1 : %f\n",surface,perimetre);

        //Rectangle 2
        float longueur2=33f;
        float largeur2=45f;

        float surface2=calculDeLaSurface(longueur2,largeur2);
        float perimetre2=calculDuPerimetre(longueur2,largeur2);
        System.out.printf("Surface 2 : %f\nPerimetre 2 : %f\n",surface2,perimetre2);

        float papy=78f;
        float mamy=87f;
        float surfacePapyMamy=calculDeLaSurface(papy,mamy);
        float permietrePapyMamy=calculDuPerimetre(papy,mamy);
    }
}
