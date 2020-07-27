package ProgramowanieObiektowe;

public class KlasyAnonimowe {

    public static void main(String[] args) {

        ZachowaniePoWciśnięciu z = new ZachowaniePoWciśnięciu() { // uzycie klasy anonimowej zamiast tworzyc nowy obiekt klasy przycisk tworzymy za pomoca konstruktora interfejsu: pojawia sie od razu implementacja metody akcja()
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej");
            }
        };


        z.akcja();

        Przycisk p = new Przycisk();

        p.dodajAkcje(z);
    }
}


//Klasa anonimowa = klasa która nie ma nazwy


interface ZachowaniePoWciśnięciu {

    void akcja();
}
 class Przycisk  {

    void dodajAkcje(ZachowaniePoWciśnięciu z) {
        z.akcja();
    }
}

class Przycisk2 implements ZachowaniePoWciśnięciu {

    @Override
    public void akcja() {

        System.out.println("Przycisk 2 naciśnięty");

    }

}