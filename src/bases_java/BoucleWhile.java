package bases_java;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Veuillez definir un code PIN : ");
        var codePIN=input.nextInt();

        System.out.println("************************");
        System.out.println("**Telephone verrouille**");
        System.out.println("************************");

        int codeATester=0;
        while (codeATester!=codePIN){//9999!=9999 => Faux
            System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
            codeATester=input.nextInt();//9999
        }

    }
}
