package ProgramowanieObiektowe;

public class Referencje {

    public static void main(String[] args) {

        int a = 53; // jesli przypiszemy wartosc do zmiennej w taki sposób to przechowujemy jej wartość bezpośrednio. Zazwyczaj przechowujemy tak typy prymitywne
        int b = a;

        b = 30; // wydrukuje nam wartosc 53

        System.out.println(a);

        TestXd x = new TestXd(); // pod zmienna x nie znajduje sie zadna zwykla wartosc TYLKO ADRES - Jest to tak zwana zmienna referencyjna. Przechowuje sie tak typy klasowe/obiektowe

        TestXd y = x;

        y.a = 40;

        System.out.println(x.a); // wydrukuje wartość 40 a nie 20

        String  imie = "Barteg"; //String pomimo tego ze jest typem obiektowym to zachowuje sie jak typ prumitywny. Zmienna imie przechowuje nie ADRES REFERENCYJNY tylko wartość "Barteg" bezpośrednio
        String imie2 = imie;
        imie2 = "chuj";

        System.out.println(imie);

        TestXd papaj = new TestXd();

        papaj.zmienWartość(a);

        System.out.println(a); // Wydrukuje 53 pomimo tego ze powinno byc 55

    }
}

class TestXd {

    int a = 20;

    void zmienWartość(int zmienna) {
        zmienna = zmienna + 2;
    }
}
