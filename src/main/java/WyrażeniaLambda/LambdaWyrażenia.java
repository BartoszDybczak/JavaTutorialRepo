package WyrażeniaLambda;

public class LambdaWyrażenia {

    public static void main(String[] args) {

        //Wyrażenie lambda
        ZachowaniePoWciśnięciu2 z = () -> { //strzałki są cechą charakterystyczna wyrazen lambda - lambdy to skrócony zapis zachwowania,które przedstawione jest w KlasieAnonimowej
            System.out.println("Jestem z klasy anonimowej");
        };

        ZachowaniePodłe zp = (int a, int b) -> {

            System.out.println(a + b);

        };

        PrzyciskX p = new PrzyciskX();

//        p.dodajAkcje(z);

        p.dodajAkcje(() -> { // wyrazenia lambda mozemy tez uzywac jako argumentu, który przesyłamy do funkcji dodajAkcje() - działa tak samo jak p.dodajAkcje(z)
                    System.out.println("Jestem z klasy anonimowej");
                });

        p.dodajAkcjeNaPlus(5,10,zp);
    }

    /*
                ZachowaniePoWciśnięciu2 z = () ->

                () = tutaj możemy przesłać argumenty do funkcji, którą implementujemy (w tym przypadku jest to funkcja akcja() ktora nie przyjmuje zadnych argumentow)
                -> = strzałka oznaczajaca wyrazenie lambda
                {} = treść wyrażenia, body
     */

}

interface ZachowaniePoWciśnięciu2 {
    void akcja();
//    void akcja2(int a, int b); lamby nie mogą implementować więcej NIŻ JEDNO zachowanie. Dozwolone jest tylko jedno zachowanie na jeden interfejs, który chemy wykorzystac w wyrazeniu lambda
}
interface ZachowaniePodłe {

    void akcjaNaPlus(int a, int b);

}
class PrzyciskX  {
    void dodajAkcje(ZachowaniePoWciśnięciu2 z) {
        z.akcja();
    }

    void dodajAkcjeNaPlus( int a, int b, ZachowaniePodłe z) {

        z.akcjaNaPlus(a, b);

    }

}

class Przycisk2D implements ZachowaniePoWciśnięciu2 {
    @Override
    public void akcja() {
        System.out.println("Przycisk 2 naciśnięty");
    }
}