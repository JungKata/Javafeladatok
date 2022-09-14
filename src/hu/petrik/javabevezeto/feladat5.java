package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Kérem adja meg a téglalap 'a' oldalát: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kérem adja meg a téglalap 'b' oldalát: ");
        double b = Double.parseDouble(sc.nextLine().replace(',', '.'));

        System.out.println("Kérem adja meg mit szeretne kiszámítani (K: kerület), T (terület): ");
        String muvelet = sc.nextLine();
        if (muvelet.equals("K"))
        {
            double kerulet = 2 * (a + b);
            System.out.printf("A téglalap kerülete %.2f cm\n", kerulet);
        } else if (muvelet.equals("T")) {
            double terulet = a * b;
            System.out.printf("A téglalap területe %2.f cm^2\n", terulet);
        }
        else {
            System.out.printf("Hibás üzenetet adott meg!");
        }
        if (a == b){
            System.out.printf("A megadott téglalap egy négyzet");
        }

    }
}

