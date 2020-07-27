package ProgramowanieObiektowe;

public class Statycznosc {

    int papieskaLiczba;

    public static void main(String[] args) {

//        double wynik = Matematyka.dodaj(10, 15);
//
//        System.out.println(wynik);
//
//        System.out.println(Matematyka.PI);

        Klient a = new Klient("Barteg");
        Klient b = new Klient("Madzia <3");
        Klient c = new Klient("Samojed");

        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
        System.out.println(Klient.następneId);

    }
}

class Matematyka {

    static final double PI = 3.14;

    static double dodaj(double a, double b) {
        return a + b;
    }
}

class Klient {

    Klient(String imię) {
        this.imię = imię;

        id = następneId;

        następneId++;
    }

    String imię;
    int id = 0;
    static int następneId = 1;

}