package ohtu.kivipaperisakset.pelaajat;

public class Tekoaly implements Pelaaja {

    int siirto;

    public Tekoaly() {
        siirto = 0;
    }

    @Override
    public String annaSiirto() {
        paivitaSiirto();
        switch (siirto) {
            case 0:
                return "k";
            case 1:
                return "p";
            default:
                return "s";
        }
    }
    
    private void paivitaSiirto() {
        siirto++;
        siirto = siirto % 3;
    }
    

    @Override
    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
}
