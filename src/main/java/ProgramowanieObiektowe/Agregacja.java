package ProgramowanieObiektowe;

public class Agregacja {

    public static void main(String[] args) {

       KolejnaJakżeOryginalnaKlasaPracownicz p = new KolejnaJakżeOryginalnaKlasaPracownicz("Barteg", new Adres("Watykańska",2137));

        System.out.println(p);




    }
}

class KolejnaJakżeOryginalnaKlasaPracownicz {

    String imie;

    Adres adres; //== agregacja - klasa adres laczy sie w calosci z klasa JakzeOryginalnyPracownicz

    KolejnaJakżeOryginalnaKlasaPracownicz(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }


    @Override
    public String toString() {
        return
                "imie='" + this.imie + '\'' +
                ", adres=" + adres.ulica + ' ' + adres.numerDomu;
    }
}


class Adres {

    String ulica;
    int numerDomu;


    Adres(String ulica, int numerDomu) {

        this.ulica = ulica;
        this.numerDomu = numerDomu;
    }
}
