package bases_java;

public class DoWhile {
    public static void main(String[] args) {
        int age=23;
        //On n'entre jamais dans la boucle parce qu'il le test qui s'execute en premier
        while (age<18){
            System.out.println("Inferieur -- while(condition){...}");
        }

        //La boucle va toujours s'executer au moins une fois meme si la condition n'est pas evaluee a VRAI
        do{
            System.out.println("Inferieur -- do{...}while(condition)");
        }while (age<18);
    }
}
