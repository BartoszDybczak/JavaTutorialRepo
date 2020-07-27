package ProgramowanieObiektowe;

import java.util.Arrays;

public class Interfejsy {

    public static void main(String[] args) {

        System.out.println(nazwaInterfejsu.PI);

        int[] tablica = new int[3];

        tablica[0] = 3;
        tablica[1] = -5;
        tablica[2] = 13;

        Arrays.sort(tablica);

        System.out.println(tablica[0]);

        Bezrobotny[] bezrobotny = new Bezrobotny[3];

        bezrobotny[0] = new Bezrobotny(10000);
        bezrobotny[1] = new Bezrobotny(1000);
        bezrobotny[2] = new Bezrobotny(5000);

        System.out.println(bezrobotny[0].compareTo(bezrobotny[1]));

        Arrays.sort(bezrobotny);

        for (Bezrobotny b : bezrobotny) {
            System.out.println(b.getZasiłeg());
        }
    }
}

interface nazwaInterfejsu {

    double PI =3.14; // W interfejsach wszystkie wlasciwosci są zawsze public, static i final!

    void metodaXd();  // W interfejsach wszystkie metody sa publiczne i abstrakcyjne!
}

interface papieskiInterfejs {

}

class Bezrobotny implements nazwaInterfejsu, papieskiInterfejs, Comparable {

    private double zasiłeg;

    @Override
    public void metodaXd() {
    }

    Bezrobotny(double zasiłeg) {
        this.zasiłeg = zasiłeg;
    }

    public double getZasiłeg() {
        return this.zasiłeg;
    }

    @Override
    public int compareTo(Object o) {

        Bezrobotny bezrobotnyPrzysłany = (Bezrobotny)o;

        if (this.zasiłeg < bezrobotnyPrzysłany.zasiłeg) {
            return -1;
        } else if (this.zasiłeg > bezrobotnyPrzysłany.zasiłeg) {
            return 1;
        }

        return 0;

    }
}
