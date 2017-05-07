package ohtu.kivipaperisakset.pelaajat;

// "Muistava tekoäly"
public class TekoalyParannettu implements Pelaaja {

    private final String[] muisti;
    private int vapaaMuistiIndeksi;
    private int kivienLKM, paperienLKM, saksienLKM = 0;

    public TekoalyParannettu(int muistinKoko) {
        muisti = new String[muistinKoko];
        vapaaMuistiIndeksi = 0;
    }

    @Override
    public void asetaSiirto(String siirto) {
        // jos muisti täyttyy, unohdetaan viimeinen alkio
        if (vapaaMuistiIndeksi == muisti.length) {
            poistaMuististaVanhinSiirto();
            vapaaMuistiIndeksi--;
        }
        muisti[vapaaMuistiIndeksi] = siirto;
        vapaaMuistiIndeksi++;
    }

    private void poistaMuististaVanhinSiirto() {
        for (int i = 1; i < muisti.length; i++) {
            muisti[i - 1] = muisti[i];
        }
    }

    @Override
    public String annaSiirto() {
        if (vapaaMuistiIndeksi == 0 || vapaaMuistiIndeksi == 1) {
            return "k";
        }
        String viimeisinSiirto = muisti[vapaaMuistiIndeksi - 1];
        laskeAlkioidenLKM(viimeisinSiirto);

        return siirronValinta();
    }

    private void laskeAlkioidenLKM(String viimeisinSiirto) {
        alustaAlkioidenLKM();
        for (int i = 0; i < vapaaMuistiIndeksi - 1; i++) {
            if (viimeisinSiirto.equals(muisti[i])) {
                String seuraava = muisti[i + 1];
                kasvataAlkionLKM(seuraava);
            }
        }
    }
    
    private void alustaAlkioidenLKM() {
        kivienLKM = 0;
        paperienLKM = 0;
        saksienLKM = 0;
    }

    private void kasvataAlkionLKM(String seuraava) {
        if ("k".equals(seuraava)) {
            kivienLKM++;
        } else if ("p".equals(seuraava)) {
            paperienLKM++;
        } else {
            saksienLKM++;
        }
    }

    private String siirronValinta() {
        // Tehdään siirron valinta esimerkiksi seuraavasti;
        // - jos kiviä eniten, annetaan aina paperi
        // - jos papereita eniten, annetaan aina sakset
        // muulloin annetaan aina kivi
        if (kivienLKM > paperienLKM && kivienLKM > saksienLKM) {
            return "p";
        } else if (paperienLKM > kivienLKM && paperienLKM > saksienLKM) {
            return "s";
        } else {
            return "k";
        }
    }
}
