package bases_java;

import java.util.HashMap;
import java.util.Scanner;

public class Tp21 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Combien de langages souhaitez-vous ajouter?");
        int nombreDeLangages=input.nextInt();

        input.nextLine();
        HashMap<String,String> langages=new HashMap<>();
        for(int i=1;i<=nombreDeLangages;i++){
           if(i==1){
               System.out.printf("Insérer le %der langage : ",i);
           }else{
               System.out.printf("Insérer le %dème langage : ",i);
           }
           String langage=input.nextLine();
           langages.put(langage,langage);
        }
        System.out.println(langages);

        System.out.println("Quel langage souhaitez-vous supprimer ? ");
        String langageASupprimer=input.nextLine();
        langages.remove(langageASupprimer);

        System.out.println("Après la suppression");
        System.out.println(langages);
    }
}
