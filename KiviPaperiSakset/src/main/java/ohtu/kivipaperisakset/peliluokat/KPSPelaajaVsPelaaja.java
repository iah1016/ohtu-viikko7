package ohtu.kivipaperisakset.peliluokat;

import java.util.Scanner;
import ohtu.kivipaperisakset.pelaajat.Ihmispelaaja;

public class KPSPelaajaVsPelaaja extends KPSPeliYleinen {

    public KPSPelaajaVsPelaaja(Scanner scanner) {
        super(
                new Ihmispelaaja(scanner),
                new Ihmispelaaja(scanner),
                "Ensimmäisen pelaajan siirto: ",
                "Toisen pelaajan siirto: "
        );
    }
}
