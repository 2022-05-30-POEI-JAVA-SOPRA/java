package poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        BEFORE GETTERS AND SETTERS
//        System.out.println("***********");
//        System.out.println("**Objet 1**");
//        System.out.println("************\n");
//        Rectangle terrain=new Rectangle();
//        System.out.println("Etat inital de l'objet après " +
//                "création\n======================");
//        System.out.println("La longueur : "+terrain.longueur);
//        System.out.println("La largeur : "+terrain.largeur);
//
//        System.out.println("Etat de l'objet après avoir fourni des " +
//                "valeur\n==========================");
//        terrain.longueur=500;
//        terrain.largeur=350;
//        System.out.println("La longueur : "+terrain.longueur);
//        System.out.println("La largeur : "+terrain.largeur);
//        System.out.println("Surface : "+terrain.calculDeLaSurface());
//        System.out.println("Perimète : "+terrain.calculDuPerimetre());
//
//
//        System.out.println("***********");
//        System.out.println("**Objet 2**");
//        System.out.println("************\n");
//        Rectangle parcelle=new Rectangle();
//        System.out.println("La longueur : "+parcelle.longueur);
//        System.out.println("La largeur : "+parcelle.largeur);


//        AFTER ADDING GETTERS AND SETTERS
//        System.out.println("***********");
//        System.out.println("**Objet 1**");
//        System.out.println("************\n");
//        Rectangle2 terrain=new Rectangle2();
//        System.out.println("Etat inital de l'objet après " +
//                "création\n======================");
//        System.out.println("La longueur : "+terrain.getLongueur());
//        System.out.println("La largeur : "+terrain.getLargeur());
//
//        System.out.println("Etat de l'objet après avoir fourni des " +
//                "valeur\n==========================");
//        terrain.setLongueur(500);
//        terrain.setLargeur(350);
//        System.out.println("La longueur : "+terrain.getLongueur());
//        System.out.println("La largeur : "+terrain.getLargeur());
//        System.out.println("Surface : "+terrain.calculDeLaSurface());
//        System.out.println("Perimète : "+terrain.calculDuPerimetre());



//      Ajout d'un constructeur
//        System.out.println("***********");
//        System.out.println("**Objet 1**");
//        System.out.println("************\n");
//        Rectangle3 terrain=new Rectangle3(500,350);
//        System.out.println("Etat inital de l'objet après " +
//                "création\n======================");
//        System.out.println("La longueur : "+terrain.getLongueur());
//        System.out.println("La largeur : "+terrain.getLargeur());
//
//        System.out.println("Etat de l'objet après avoir fourni des " +
//                "valeur\n==========================");
//        terrain.setLongueur(500);
//        terrain.setLargeur(350);
//        System.out.println("La longueur : "+terrain.getLongueur());
//        System.out.println("La largeur : "+terrain.getLargeur());
//        System.out.println("Surface : "+terrain.calculDeLaSurface());
//        System.out.println("Perimète : "+terrain.calculDuPerimetre());

        Rectangle3 rect=new Rectangle3();
        System.out.println(rect.getLongueur());
        System.out.println(rect.getLargeur());

        System.out.println(rect);

//        Personne chris=new Personne();
//        System.out.println("Nom : "+chris.getLastName());
//        System.out.println("Prenom : "+chris.getFirstName());
//        System.out.println("Pays : "+chris.getCountry());
//        System.out.println("Married : "+chris.getMarried());
//        System.out.println("Children : "+chris.getNumberChildren());

//        ArrayList<String> fruits=new ArrayList<>(Arrays.asList("Pomme","Mangue","Orange"));
//        System.out.println(fruits);
//
//        String[] fruits2={"Pomme","Banane","Citron"};
//        System.out.println(fruits2);
//        System.out.println(Arrays.toString(fruits2));

    }
}
