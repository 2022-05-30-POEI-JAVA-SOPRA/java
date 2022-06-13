public class Affichage {
    public static void main(String[] args) {
        String nom="Lisangola";
        String prenom="Christian";
        char genre='M';
        byte age=12;
        float poids=25.5F;
        boolean estMarie=true;

        System.out.println("Vous vous appelez "+nom+", vous avez "+age+" ans.Poid : "+poids+"Kg");
        System.out.printf("Vous vous appelez %s %s,vous avez %d ans.Poids : %.2f\n",nom,prenom,age,poids);
        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d\n\n",nom,prenom,age);

        //Avec operateur ternaire
        System.out.printf("Vous vous appelez %s %s,vous avez %d ans et vous  %s\n",nom,prenom,age,estMarie?"etes marie":"n'etes pas marie");

        //Sans operateur ternaire
        String etatMaritalAAfficher=estMarie?"etes marie":"n'etes pas marie";
        System.out.printf("Vous vous appelez %s %s,vous avez %d ans et vous  %s\n",nom,prenom,age,etatMaritalAAfficher);
    }
}
