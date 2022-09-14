package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] t1 = new double[5];
        double [] t2 = new double[5];
        double [] t3 = new double[3];

        double elem1 = 0;
        double elem2 = 0;

        for (int i = 0; i < t1.length; i++) {
            t1[i] = Math.floor((Math.random()*50)+1);
        }

        for (int i = 0; i < t2.length; i++) {
            t2[i] = Math.floor((Math.random()*25)+10);
        }

    }
}
