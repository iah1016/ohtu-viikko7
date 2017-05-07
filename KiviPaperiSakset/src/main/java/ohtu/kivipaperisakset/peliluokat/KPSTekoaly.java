package ohtu.kivipaperisakset.peliluokat;

import ohtu.kivipaperisakset.pelaajat.Tekoaly;
import java.util.Scanner;
import ohtu.kivipaperisakset.pelaajat.Ihmispelaaja;

public class KPSTekoaly extends KPSPeliYleinen {

    public KPSTekoaly(Scanner scanner) {
        super(
                new Ihmispelaaja(scanner),
                new Tekoaly(),
                "Ensimmäisen pelaajan siirto: ",
                "Tietokone valitsi: "
        );
    }
}
