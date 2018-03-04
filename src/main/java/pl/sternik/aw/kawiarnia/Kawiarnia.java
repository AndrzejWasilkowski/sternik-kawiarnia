package pl.sternik.aw.kawiarnia;

import pl.sternik.aw.kawiarnia.dekoratory.Cukier;
import pl.sternik.aw.kawiarnia.dekoratory.Mleko;
import pl.sternik.aw.kawiarnia.napoje.Kawa;
import pl.sternik.aw.kawiarnia.napoje.Napoj;



public abstract class Kawiarnia {

    public static void main(String[] args) {

        Napoj kawa = new Kawa();
        System.out.println(kawa);

        kawa = new Mleko(kawa);
        System.out.println(kawa);
        kawa = new Cukier(kawa);
        System.out.println(kawa);
        kawa = new Cukier(kawa);
        System.out.println(kawa);
//        kawa = new BitaSmietana(kawa);
//        System.out.println(kawa);
//
//        System.out.println("-------- Czekolada --------");

//        Napoj czekolada = new Czekolada();
//        System.out.println(czekolada);
//
//        czekolada = new BitaSmietana(czekolada);
//        System.out.println(kawa);



//		System.out.println("------- Template Metod -----");
//		Ekspres ekspres = new EkspresCzekolada();
//		Napoj napoj = ekspres.dajNapoj();
//		System.out.println(napoj);

    }

}