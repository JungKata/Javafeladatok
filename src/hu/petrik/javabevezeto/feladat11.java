package hu.petrik.javabevezeto;

import java.util.Arrays;
import java.util.Scanner;

public class feladat11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem adjon meg egy számot: ");
        int sam = sc.nextInt();


        int ossz = 0;

        for (int i = 1; i < sam; i +=2)
        {
            ossz += i;
        }
        System.out.printf("Itt vannak a páratlan számok összege: %d" , ossz);


        /*for (int tobbi = 0; tobbi < 1000; tobbi++) {
            if (tobbi % 2 == 1) {
                System.out.print(tobbi + " ");
            }
        */

    }
}

