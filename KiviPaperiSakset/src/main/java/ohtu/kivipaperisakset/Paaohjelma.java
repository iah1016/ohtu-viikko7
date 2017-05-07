package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.peliluokat.KPSPeli;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tekstit = luoAlkuvalikonTekstit();

        alkuvalikkosilmukka(scanner, tekstit);
    }

    private static void alkuvalikkosilmukka(Scanner scanner, String[] tekstit) {
        while (true) {
            KPSPeli peli = pelinValinta(scanner, tekstit);
            if (peli == null) {
                break;
            }
            pelinPelaaminen(peli, tekstit);
        }
    }

    private static KPSPeli pelinValinta(Scanner scanner, String[] tekstit) {
        System.out.println(tekstit[0]);
        String vastaus = scanner.nextLine();
        return KPSTehdas.luoPeli(vastaus, scanner);
    }
    
    private static void pelinPelaaminen(KPSPeli peli, String[] tekstit) {
        System.out.println(tekstit[1]);
        peli.pelaa();
    }

    private static String[] luoAlkuvalikonTekstit() {
        String[] tekstit = new String[2];
        tekstit[0] = "\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetetaan";
        tekstit[1] = "peli loppuu kun pelaaja antaa virheellisen "
                + "siirron eli jonkun muun kuin k, p tai s";
        return tekstit;
    }
}
