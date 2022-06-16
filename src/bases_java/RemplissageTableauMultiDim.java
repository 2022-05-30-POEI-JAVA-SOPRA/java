package bases_java;

import java.util.Arrays;
import java.util.Scanner;

public class RemplissageTableauMultiDim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Nombre de lignes : ");
        int taille=input.nextInt();

        int[][] matrice=new int[taille][];
        for(int i=0;i<matrice.length;i++){
            System.out.printf("Donnez le nombre de colonne pour la ligne[%d]: ",i);
            int nombreDeColonne=input.nextInt();
            matrice[i]=new int[nombreDeColonne];
            for(int j=0;j<matrice[i].length;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
            }
        }


        System.out.println("bases_java.Affichage de tout le tableau");
        for(int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice[i].length;j++){
                System.out.print(matrice[i][j] +" ");
            }
            System.out.println();
        }
    }
}
