package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        int bekertSzam = 0;
        int tombSzamok = 0;

        while (tombSzamok < 5){
            System.out.println("Kérem adjon meg számokat: ");
            bekertSzam = Integer.parseInt(sc.nextLine());
            arr[tombSzamok] = bekertSzam;
            tombSzamok++;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.printf("Tömb számai: %d\n", arr[i]);

        }
    }
}
