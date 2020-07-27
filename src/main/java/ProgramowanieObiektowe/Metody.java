package ProgramowanieObiektowe;

public class Metody {

    public static void main(String[] args) {

        Test a = new Test();

        a.wypisz("Barteg", "Dybczag");

        int wynicz = a.dodaj(10, 225);

        double wynicz2 = a.dzielenie(5,7);

        double wynicz3 = a.dodaj(2.1, 3.7);

        System.out.println(wynicz);
        System.out.println(wynicz2);
        System.out.println(wynicz3);
    }
}

class Test {

    void wypisz(String imie, String nazwisko) {
        System.out.println("Nazywam się: " + imie + " " + nazwisko);
    }

    int dodaj(int a, int b) {
        return a + b;
    }

    //Przeciążanie metod - ta sama nazwa metody co powyzej ale inny typ przyjmowanych argumentów
    double dodaj(double a, double b) {
        return a + b;
    }

    double dzielenie(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a/b;
    }
}