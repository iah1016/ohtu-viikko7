package ohtu.kivipaperisakset.peliluokat;

import java.util.Scanner;
import ohtu.kivipaperisakset.pelaajat.TekoalyParannettu;
import ohtu.kivipaperisakset.pelaajat.Ihmispelaaja;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPSPeliYleinen {


    public KPSParempiTekoaly(Scanner scanner) {
        super(
                new Ihmispelaaja(scanner),
                new TekoalyParannettu(20),
                "Ensimmäisen pelaajan siirto: ",
                "Tietokone valitsi: "
        );
    }
}
