package bases_java;

import java.util.*;

public class TpJoursSemaine {
    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("*** Jour de la semaine ***");
        System.out.println("**************************");
        ArrayList<Integer> numeroJours=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<String> nomsJours=new ArrayList<>(Arrays.asList(
                "lundi","mardi","mercredi",
                "jeudi","vendredi","samedi","dimanche"));

        HashMap<Integer,String> jourSemaine=new HashMap<>();

        for(int i=0;i<numeroJours.size();i++){
            jourSemaine.put(numeroJours.get(i),nomsJours.get(i));
        }


        for(Map.Entry<Integer,String> jour:jourSemaine.entrySet()){
            System.out.printf("%d |=> %s\n",jour.getKey(),jour.getValue());
        }

        var input=new Scanner(System.in);
        while (true){
            System.out.print("\nVeuillez entrer unn nombre pour voir le jour correspond" +
                    " :" +
                    " ");
            int jour=input.nextInt();
            if(jour<1 || jour>7){
                System.out.printf("Error : Veuillez entrer un jour valide entre 1 et 7");
                continue;
            }

            System.out.printf("Le jour correspondant à %d est %s\n",jour,
                    jourSemaine.get(jour));
            System.out.print("Voulez-vous continuer?");
            char response=Character.toLowerCase(input.next().charAt(0));
            if(!(response=='o')){
                break;
            }
        }

    }

}
