package hu.petrik.javabevezeto;
import java.util.Scanner;

public class feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy szöveget: ");
        String szoveg = sc.nextLine();
        String manuPont = "";
        while (!manuPont.equals("f"))
        {
            System.out.println("Adja meg mit szedretne csinálni a szöveggel: ");
            System.out.println("\t a- Nagybetűsé alakítani");
            System.out.println("\t b- Kisbetűssé alakítani");
            System.out.println("\t c- Lekérdezni a hosszát");
            System.out.println("\t d- Össze hasonlítani a másikkal");
            System.out.println("\t e- A szöveg egy részét kiiratni");
            System.out.println("\t f- Kilépés");
            manuPont = sc.nextLine().toLowerCase();
            switch (manuPont){
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "c":
                    System.out.printf("A szoveg hossza %d karakter \n" , szoveg.length());
                    break;
                case "d":
                    System.out.println("Kérem adja meg a masik szöveget:");
                    String szoveg2= sc.nextLine();
                    int osszehasonlitas = szoveg.compareTo(szoveg2);
                    if (osszehasonlitas < 0)
                    {
                        System.out.println("Az első szöveg van előrébb az ABC-ben");
                    }else if(osszehasonlitas > 0 ){
                        System.out.println("Második szöveg van előrébb az ABC-ben");
                    }else {
                        System.out.println("A két szöveg megegyezik");
                    }

                    break;
                case "e":
                    System.out.println("Kérem adja meg a kezdő karakter sorszámát amit ki szeretne iratni: ");
                    int a = sc.nextInt();
                    System.out.println("Kérem adja meg a utolsó karakter sorszámát amit ki szeretne iratni: ");
                    int b = sc.nextInt();
                    System.out.println(szoveg.substring(a -1, b - 1));
                    break;
                case "f":
                    System.out.println("Viszlát");
                    break;
                default:
                    System.out.println("Rossz lehetőséget adott meg, kérem a menüpontok közül válasszon!");
                    break;


            }

        }
    }
}
