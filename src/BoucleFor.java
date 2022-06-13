import java.util.Scanner;

public class BoucleFor {
    public static void main(String[] args) {
        System.out.println("Sans  la boucle for\n=====================");
        //Avant la boucle for
        //Afficher tous les nombres allant de 1 a 10 a la puissance 2
        System.out.println(Math.pow(1,2));//
        System.out.println(Math.pow(2,2));// 1 + 1 = 2
        System.out.println(Math.pow(3,2));// 2 + 1 = 3
        System.out.println(Math.pow(4,2));// 3 + 1 = 4
        System.out.println(Math.pow(5,2));// 4 + 1 = 5
        System.out.println(Math.pow(6,2));// 5 + 1 = 6
        System.out.println(Math.pow(7,2));// 6 + 1 = 7
        System.out.println(Math.pow(8,2));// 7 + 1 = 8
        System.out.println(Math.pow(9,2));// 8 + 1 = 9
        System.out.println(Math.pow(10,2));// 9 + 1 = 10

        // Pour i <- allant de 1 a 10
        //     Math.pow(i,2) => Math.pow(1,2);
        //     i = i + 1
        //Fin pour
        //Code de la boucle for
        //1 <=10 : Vrai
        //2 <= 10 : Vrai
        //3 <= : vrai
        //4 <= 10 : vrai
        //5 <= 10 : vrai
        //6 <= 10 : vrai
        //7 <= 10 : vrai
        //8 <= 10 : vrai
        //9 <= 10 : vrai
        //10 <= 10 : vrai
        // 11 <= 10 : Faux
        System.out.println("Utilisation de la boucle for\n============================");
        for(int i=1;i<=10;i=i+1){
            System.out.println(Math.pow(i,2));
        }

        System.out.println("Table multiplication\n========================");
        var input=new Scanner(System.in);
        System.out.print("Entrer le nombre dont vous voulez voir la table de multiplication : ");
        var nombre=input.nextInt();
        for(int i=1;i<=12;i++){
//            System.out.println(nombre+ " x "+i+" = "+(i*nombre));
            System.out.printf("%d x %d = %d\n",nombre,i,(nombre*i));
        }

//        Table de multplication version 2
        System.out.println("Table multiplication V2\n========================");
        System.out.print("Entrer le nombre dont vous voulez voir la table de multiplication : ");
        var nombre2=input.nextInt();
        System.out.print("Debut : ");
         var nombreDebut=input.nextInt();

        System.out.print("Fin : ");
        var nombreFin=input.nextInt();


        for(int i=nombreDebut;i<=nombreFin;i +=1){
//            System.out.println(nombre2+ " x "+i+" = "+(i*nombre2));
            System.out.printf("%d x %d = %d\n",nombre2,i,(nombre2*i));
        }

    }
}


// 2 - 5
//2 x 0 = 0
//2 x 1= 2
//2 x 2= 4

//3 x 0 = 0
//3 x 1= 3
//3 x 2= 6

//4 x 0 = 0
//4 x 1= 4
//4 x 2= 8

//5 x 0 = 0
//5 x 1= 5
//5 x 2= 10

