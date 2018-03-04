package pl.sternik.aw.kawiarnia.dekoratory;

import pl.sternik.aw.kawiarnia.napoje.Napoj;

public class Cukier extends NapojDekorator {
    private static final double CENA_DODATKU = 0.5D;
    private static final String OPIS_DODATKU = " z Cukrem";

    public Cukier(Napoj napoj) {
        super(napoj);
        System.out.println("Dodaje cukier (cen a" + CENA_DODATKU + " zł)");
    }

    @Override
    public String getNazwa() {
        return getNapoj().getNazwa()+OPIS_DODATKU;
    }

    @Override
    public double getCena() {
        return getNapoj().getCena() + CENA_DODATKU;
    }

    @Override
    public String toString() {
        return "ML [nazwa()=" + getNazwa() + ", cena=" + getCena() + "]";
    }
}
