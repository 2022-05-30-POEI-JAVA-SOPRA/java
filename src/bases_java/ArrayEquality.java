package bases_java;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] nombres=new int[3];
        nombres[0]=12;
        nombres[1]=15;
        nombres[2]=20;
        System.out.println("bases_java.Affichage tableau nombre1 :"+ Arrays.toString(nombres));

        int[] nombres2=nombres;
        nombres2[0]=33;

        System.out.println("bases_java.Affichage tableau nombre1 après création de nombre 2 :"+ Arrays.toString(nombres));

        if(nombres==nombres2){
            System.out.println("Les 2 tableau pointent vers un même tableau");
        }

        int[] nombres3=new int[3];
        nombres3[0]=33;
        nombres3[1]=15;
        nombres3[2]=20;

        System.out.println("bases_java.Affichage nombre 3 : "+Arrays.toString(nombres3));

        if(nombres==nombres3){
            System.out.println("nombre et nombre3 pointent vers le même tableau");
        }else{
            System.out.println("nombre et nombre3 ne pointent pas vers le même tableau");
        }

    }
}
