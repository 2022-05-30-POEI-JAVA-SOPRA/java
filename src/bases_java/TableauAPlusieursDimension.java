package bases_java;

import java.util.Arrays;

public class TableauAPlusieursDimension {
    public static void main(String[] args) {
//        int[] a={1,2,3,4,5};
//        int[] a2=new int[5];

        int[][] nombres={
                {1,2,6,5},
                {2,4,9},
                {7,3}
        };


//        bases_java.Affichage sans boucle
        System.out.println("bases_java.Affichage sans boucle\n========================");
//        Première ligne(1er tableau)
        System.out.println("1er tableau\n==========");
        System.out.println(nombres[0][0]);
        System.out.println(nombres[0][1]);
        System.out.println(nombres[0][2]);
        System.out.println(nombres[0][3]);

//        Deuxième ligne(2ème tableau)
        System.out.println("\n2ème tableau\n==========");
        System.out.println(nombres[1][0]);
        System.out.println(nombres[1][1]);
        System.out.println(nombres[1][2]);


//        Troisième ligne(3ème tableau)
        System.out.println("\n3ème tableau\n==========");
        System.out.println(nombres[2][0]);
        System.out.println(nombres[2][1]);


        System.out.println("bases_java.Affichage avec la boucle " +
                "for\n==============================");

        for(int i=0;i<nombres.length;i++){
//            System.out.println(Arrays.toString(nombres[i]));
            for(int j=0;j<nombres[i].length;j++){
                System.out.println(nombres[i][j]);
            }
        }
    }
}
