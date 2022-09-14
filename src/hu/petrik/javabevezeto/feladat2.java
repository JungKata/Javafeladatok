package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem adja meg a terület szélességét méterben: ");
        double szelesseg = sc.nextDouble();

        System.out.print("Kérem adja meg a terület magasságát méterben: ");
        double magassag = sc.nextDouble();

        double terulet = szelesseg * magassag;
        System.out.printf("A konyhánk területe: %.2f m2", terulet);

        double csempe = 0.2 * 0.2;
        double darab = terulet / csempe;
        double ossz = darab + 0.1 * darab;
        System.out.printf(" %.2f db csempére van szükség a burkoláshoz", ossz);
    }
}
