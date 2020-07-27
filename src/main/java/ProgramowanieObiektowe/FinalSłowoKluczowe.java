package ProgramowanieObiektowe;

import java.util.Date;

public class FinalSłowoKluczowe {


    public static void main(String[] args) {

        final double PI;

        PI = 3.14;

        Pracownicz p = new Pracownicz();

        System.out.println(p.dataZatr);



    }
}

//final class Czlowieg {
//
//}

//class Murzyn extends Czlowieg { // nie moze rozszerzyc klasy Człowieg bo Człowieg jest final
//
//}

abstract class Osobacz {

}

class Pracownicz extends Osobacz {

    final Date dataZatr;

    Pracownicz() {
        this.dataZatr = new Date();
    }

    Pracownicz(Date data) {
        this.dataZatr = data;
    }

    final public Date getDataZatr() {
        return this.dataZatr;
    }
}

class Kuc extends Pracownicz {


}


