package ProgramowanieObiektowe;

public class ProgramowanieObiektoweWstęp {

    public static void main(String[] args) {

        /*
                Obiekty - to pojemniki do przechowywania zmiennych i funkcji tematycznie ze sobą powiązanych do dalszego łatwiejszego użycia

                Klasy - foremki do tworzenia egzemplarzy obiektów

                Klasa składa się z:
                Properties - właściwości klasy
                Metody
         */

        Monitor toshiba = new Monitor();
        toshiba.szerokość = 124;

        Monitor samsung = new Monitor();
        samsung.szerokość = 215;

        System.out.println(toshiba.szerokość);
        System.out.println(samsung.szerokość);
        }
}

class Monitor {
    //Class properties:

    int szerokość;
    int wysokość;

    //Class methods

    void włącz() {

    }

    void wyłącz() {

    }
}