package hu.petrik.javabevezeto;


import java.io.PrintStream;
import java.util.Scanner;

public class Feladat17 {
    private static PrintStream iout;

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
        for (int i = 0; i <t1.length ; i++) {
            elem1 = t1[i];
            for (int j = 0; j < t2.length; j++) {
                elem2 = t2[j];
            }
            for (int j = 0; j <t3.length ; j++) {
                t3[j] = elem1 + elem2;
                //System.out.printf("A harmadik tömb elemei: %1.f",t3[j]);
                System.out.printf("Harmadik tömb elemei %f \n", t3[i]);
            }
        }

    }
}
