package bases_java;

public class StringMethods {
    public static void main(String[] args) {
        String nom="Meava";

//        variable.charAt() : Retourne le caractère à la position passé en argument
        System.out.println(nom.charAt(2));//Access à un caractère du tableau

//        Parcourir un string caractère par caractère
        System.out.println("Itération sut les charactères\n====================");
        for(int i=0;i<nom.length();i++){
            System.out.println(nom.charAt(i));
        }

//        variable.indexOf() : Retourne la première occurence de l'index du caractère
//        passé en argument
        System.out.println(nom.indexOf('a'));

//        Remplacement des caractères
        String nom2="abracadabra";
        System.out.println(nom2.replace('a','*'));

//        Extraire une sous-chaine :  Christian Lisangola
         String chaine="Christian Lisangola";
         String chaine2=chaine.substring(2,9);//[2,9[
        System.out.println(chaine2);
    }
}
