public class ConditionsIntro {
    public static void main(String[] args) {
        //Declaration de la variable age
        byte age=18;

        //interface_class_abstraites.Test condition
        // si age >= 18 alors
        // Afficher "Vous etes majeur, et pouvez donc participer a la competition"
        //fin sin
        //Sinon
        // Afficher "Vous etes mineur, et vous ne pouvez pas y participer"
        //Fin sin
        if(age>=18){
            System.out.println("Vous etes majeur.Donc vous pouvez participer");
        }else{
            System.out.println("Vous n'etes majeur, donc vous ne pouvez pas participer");
        }

        String pays="Chine";
        if(pays.equals("France")){
            System.out.println("Bonjour");
        }else if(pays.equals("Allemagne")){
            System.out.println("Guten Tag");
        }else if(pays.equals("Espagne")){
            System.out.println("Holla");
        }else if(pays.equals("Chine")){
            System.out.println("Ninhau");
        }else{
            System.out.println("Le pays fourni n'est pas supporte");
        }

        //System.out.println("élève");
    }
}
