package bases_java;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom=input.nextLine();

        System.out.print("Votre prenom : ");
        String prenom=input.next();

        System.out.print("Votre genre : ");
        char genre=input.next().charAt(0);

        System.out.print("Votre age : ");
        byte age=input.nextByte();

        System.out.print("Votre poids : ");
        float poids=input.nextFloat();

        System.out.printf("Nom : %s\nPrenom : %s\nGenre : %c\nAge : %d\nPoids : %.2f\n",prenom,nom,genre,age,poids);
    }
}

// christian(string) => (char)c=>0   (char)h=>1  (char)r=>2  (char)i=>3  (char)s=>4  (char)t=>5  (char)i=>6  (char)a=>7  (char)n=>8