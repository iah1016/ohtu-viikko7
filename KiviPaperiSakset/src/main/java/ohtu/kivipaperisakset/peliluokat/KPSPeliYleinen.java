package ohtu.kivipaperisakset.peliluokat;

import ohtu.kivipaperisakset.pelaajat.Pelaaja;

/**
 *
 * @author Ilja Häkkinen
 */
public abstract class KPSPeliYleinen extends KPSPeli {

    private final Pelaaja pelaaja1;
    private final Pelaaja pelaaja2;
    private final String ekanPelaajanTeksti;
    private final String tokanPelaajanTeksti;

    public KPSPeliYleinen(Pelaaja pelaaja1, Pelaaja pelaaja2,
            String ekanPelaajanTeksti, String tokanPelaajanTeksti) {
        super();
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.ekanPelaajanTeksti = ekanPelaajanTeksti;
        this.tokanPelaajanTeksti = tokanPelaajanTeksti;
    }

    @Override
    String annaEkanPelaajanSiirto() {
        return super.annaPelaajanSiirto(pelaaja1, ekanPelaajanTeksti);
    }

    @Override
    String annaTokanPelaajanSiirto() {
        return super.annaPelaajanSiirto(pelaaja2, tokanPelaajanTeksti);
    }

    @Override
    void asetaSiirrot(String[] siirrot) {
        super.asetaSiirto(pelaaja1, siirrot[1]);
        super.asetaSiirto(pelaaja2, siirrot[0]);
    }
}
