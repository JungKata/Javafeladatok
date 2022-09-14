package hu.petrik.javabevezeto;

import java.util.Arrays;
import java.util.Scanner;

public class feladat8 {
    public static void main(String[] args) {
        System.out.println("Kérem adja meg a tippjét (0- fej || 1-írás)");
        Scanner sc = new Scanner(System.in);
        int tipp = sc.nextInt();
        // véletlen egész szám a és b között :(int) (MAth.round()) * (b - a + 1)) + a
        int feldobas =(int) (Math.random() * 2);
        String feldobasSzoeges= (feldobas == 0) ? "fej" : "írás";
        //System.out.printf("A dobás eredménye %s", (feldobas ==0)? "fej" : "írás");
        System.out.printf("A dobás eredménye %s", feldobasSzoeges);
        if (tipp == feldobas){
            System.out.println("Gratulálok nyert");
        }else {
            System.out.println("Sajnos most nem nyert, próbálkozzon újra");
        }
    }
}
