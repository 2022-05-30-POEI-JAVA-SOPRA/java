import java.util.Scanner;

public class ConstantesEtVar {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
//        constante : Une fois declaree la valeur ne peut plus changer
        final double g=9.8;

//        declaration par inference
        var pays="France";

        var age1=22;

        int age; // 1 - declaration sans initialisation
        age=17;

        double poids=85;// 2 - declaration avec initialisation

    }
}
