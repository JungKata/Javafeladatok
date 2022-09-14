package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem adja meg az elért pontszámot: ");
        int pontSzam = sc.nextInt();
        int kiiras = 0;

        if (pontSzam >= 0 && pontSzam <= 42) {
            kiiras = 1;
        }
        if (pontSzam >= 43 && pontSzam <= 57) {
            kiiras = 2;
        }
        if (pontSzam >= 58 && pontSzam <= 72) {
            kiiras = 3;
        }
        if (pontSzam >= 73 && pontSzam <= 87) {
            kiiras = 4;
        }
        if (pontSzam >= 88 && pontSzam <= 100) {
            kiiras = 5;
        }
        switch (kiiras)
        {
            case 1 :
                System.out.printf("Elégtelen");
                break;

                case 2 :
                System.out.printf("Elégséges");
                break;

                case 3 :
                System.out.printf("Közepes");
                break;

                case 4 :
                System.out.printf("Jó");
                break;

            case 5 :
                System.out.printf("Jeles");
                break;


        }

    }
}
