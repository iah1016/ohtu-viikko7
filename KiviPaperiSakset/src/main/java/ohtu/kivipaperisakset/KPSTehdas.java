package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.peliluokat.*;
import java.util.Scanner;

/**
 *
 * @author Ilja Häkkinen
 */
public class KPSTehdas {

    public static KPSPeli luoPeli(String tyyppi, Scanner scanner) {
        switch (tyyppi) {
            case "a":
                return luoKPSPelaajaVsPelaaja(scanner);
            case "b":
                return luoKPSTekoaly(scanner);
            case "c":
                return luoKPSParempiTekoaly(scanner);
            default:
                return null;
        }
    }

    public static KPSPeli luoKPSPelaajaVsPelaaja(Scanner scanner) {
        return new KPSPelaajaVsPelaaja(scanner);
    }

    public static KPSPeli luoKPSTekoaly(Scanner scanner) {
        return new KPSTekoaly(scanner);
    }

    public static KPSPeli luoKPSParempiTekoaly(Scanner scanner) {
        return new KPSParempiTekoaly(scanner);
    }
}
