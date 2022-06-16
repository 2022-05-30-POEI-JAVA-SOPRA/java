package bases_java;

public class TableauxATailleFixe {
    public static void main(String[] args) {
        //Creation des tableaux
        float[] notesPhysique={17.5F,18.2F,19,9,12};//Taille 5



        //Acces au tableau sans boucle
        System.out.println("Acces au tableau sans boucle\n***********************");
        System.out.println(notesPhysique[0]);
        System.out.println(notesPhysique[1]);
        System.out.println(notesPhysique[2]);
        System.out.println(notesPhysique[3]);
        System.out.println(notesPhysique[4]);

        System.out.println("Acces au tableau avec une boucle\n*****************************");
        for(int i=0;i<=notesPhysique.length-1;i++){
            System.out.println(notesPhysique[i]);
        }

//        Calcul de la moyene des notes
        float sommeDesNotes=0;
        for(int i=0;i<=notesPhysique.length-1;i++){
            // i = 0, sommeDesNotes=0;notesPhysique[0] = 17.5
            //sommesDesNots= sommeDesNotes+notesPhysique[0]=0+17.5 = 17.5

            // i=1,notesPhysique[1]=18.2
            //sommeDesNotes=17.5+18.2 = 35.7

            //i=2, notesPhysique[2]=19
            //sommeDesNotes=35.7 + 19 = 54.7

            //i=3, notesPhysique[3]=9
            //sommeDesNotes=54.7+9 = 63.7

            //i=4, notesPhysique[4]=12
            //sommeDesNotes=63.7 + 12 = 75.7
            sommeDesNotes = sommeDesNotes+notesPhysique[i];
        }

        System.out.printf("Somme des notes = %f : \n",sommeDesNotes);

        float moyenneDesNotes=sommeDesNotes/notesPhysique.length;
        System.out.printf("Moyenne des notes : %f",moyenneDesNotes);

    }
}
