package bases_java;

import java.util.Scanner;

public class StringStorage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String nom="Jordan";
        String nom2="Jordan";
        if(nom==nom2){
            System.out.println("nom pointe vers le même string que nom2");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom2");
        }

        System.out.println();
        System.out.print("Entrez un nom : ");
        String nom3=input.nextLine();
//        Ce test va être évalué à false
//        Parce que les strings fournis à partie du clavier ne sont pas stockés dans le
//        pool des littéraux
        System.out.println("Test avant  d'ajouter nom3 dans le pool des " +
                "littéraux\n============================");
        if(nom==nom3){
            System.out.println("nom pointe vers le même string que nom3");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom3");
        }
        System.out.println("Tester les valeurs stockées par 2 strings");

//        Test des valeurs de 2 strings
        if(nom.equals(nom3)){
            System.out.println("nom contient le même string que nom3");
        }else{
            System.out.println("nom ne contient pas le même string que nom3");
        }

        System.out.println();
        System.out.println("Test après avoir ajouté nom3 dans le pool des " +
                "littéraux\n=============================");
        nom3=nom3.intern();
        if(nom==nom3){
            System.out.println("nom pointe vers le même string que nom3");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom3");
        }
    }
}
