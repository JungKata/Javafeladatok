package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Mondjon egy 1-12 között: ");
        int honap = sc.nextInt();
        switch (honap) {
            case 1:
                System.out.printf("Január\n");
                break;

            case 2:
                System.out.printf("Február\n");
                break;

            case 3:
                System.out.printf("Március\n");
                break;

            case 4:
                System.out.printf("Április\n");
                break;

            case 5:
                System.out.printf("Május\n");
                break;
            case 6:
                System.out.printf("Junius\n");
                break;
            case 7:
                System.out.printf("Július\n");
                break;
            case 8:
                System.out.printf("Augusztus\n");
                break;
            case 9:
                System.out.printf("Szeptember\n");
                break;
            case 10:
                System.out.printf("Október\n");
                break;
            case 11:
                System.out.printf("November\n");
                break;
            case 12:
                System.out.printf("December\n");
                break;
            default:
                System.out.printf("Rossz számot adott meg\n");
                break;
        }
                if (honap == 12 || honap <= 2)
                {
                    System.out.println("A téli évszakban járunk");
                }
                else if (honap >= 3 && honap <= 5)
                {
                    System.out.println("A tavaszi évszakban járunk");
                }
                else if (honap >= 6 && honap <= 8)
                {
                    System.out.println("A nyári évszakban járunk");
                }
                else {
                    System.out.println("Az őszi évszakban járunk");
                }



    }
}
