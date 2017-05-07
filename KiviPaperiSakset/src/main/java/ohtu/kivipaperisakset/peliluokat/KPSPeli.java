package ohtu.kivipaperisakset.peliluokat;

import ohtu.kivipaperisakset.Tuomari;
import ohtu.kivipaperisakset.pelaajat.Pelaaja;

/**
 *
 * @author Ilja Häkkinen
 */
public abstract class KPSPeli {

    private final Tuomari tuomari;
    private final String[] siirrot;

    public KPSPeli() {
        this.tuomari = new Tuomari();
        this.siirrot = new String[2];
    }

    // pelisilmukka
    public void pelaa() {
        while (true) {
            siirrot[0] = annaEkanPelaajanSiirto();
            siirrot[1] = annaTokanPelaajanSiirto();

            if (!siirrotOK(siirrot)) {
                break;
            }
            tuomarinVuoro(siirrot);
        }
        lopputekstit();
    }

    // abstraktit metodit
    abstract String annaEkanPelaajanSiirto();

    abstract String annaTokanPelaajanSiirto();

    abstract void asetaSiirrot(String[] siirrot);

    // aliluokkien käyttämät metodit
    protected String annaPelaajanSiirto(Pelaaja pelaaja, String teksti) {
        String siirto = pelaaja.annaSiirto();
        System.out.println(teksti + siirto);
        return siirto;
    }

    protected void asetaSiirto(Pelaaja pelaaja, String siirto) {
        pelaaja.asetaSiirto(siirto);
    }

    // pelisilmukan käyttämät metodit    
    private boolean siirrotOK(String[] siirrot) {
        return onkoSiirtoOK(siirrot[0]) && onkoSiirtoOK(siirrot[1]);
    }

    private boolean onkoSiirtoOK(String siirto) {
        return siirto.matches("[kps]{1}");
    }

    private void tuomarinVuoro(String[] siirrot) {
        tuomari.kirjaaSiirto(siirrot[0], siirrot[1]);
        System.out.println(tuomari);
        System.out.println();
    }

    private void lopputekstit() {
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

}
