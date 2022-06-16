package bases_java;

import java.util.ArrayList;
import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {
        ArrayList<String> programmingLanguages=new ArrayList<>();
        System.out.println(programmingLanguages);

        programmingLanguages.remove("python");
        System.out.println(programmingLanguages);


        HashMap<String,String> identite=new HashMap<>();
        identite.put("nom","Lisangola");
        identite.put("prenom","Christian");


        System.out.println(identite.get("nom"));

        String phrase="je suis dans une joie immense";
//
        HashMap<Character,Integer> occurenceLettres=new HashMap<>();

        //System.out.println(occurenceLettres);

        //occurenceLettres.put("a",5);
//        System.out.println(occurenceLettres);
        for(int i=0;i<phrase.length();i++){
//            System.out.println(phrase.charAt(i));
            char key=phrase.charAt(i);
            if(occurenceLettres.containsKey(key)){
                int previousValue=occurenceLettres.get(key);
                occurenceLettres.replace(key,previousValue+1);
            }else{
                occurenceLettres.put(key,1);
            }

        }
        System.out.println(occurenceLettres);
        System.out.println("Occurence de s : "+occurenceLettres.get('s'));

    }
}
