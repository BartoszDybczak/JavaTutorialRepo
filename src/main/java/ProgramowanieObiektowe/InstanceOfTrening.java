package ProgramowanieObiektowe;

public class InstanceOfTrening {

    public static void main(String[] args) {

        Osoba[] osoba = new Osoba[4];

        osoba[0] = new Pracownik("Barteg", "Dybczag", 2137);
        osoba[1] = new Student("Papiesz", "Polag");


        for (Osoba person : osoba) {

            if (person instanceof Pracownik) // jesli uzyjemy instanceof to pętla wykona sie tylko dla instancji klasy Osoba. Czyli wykona sie tylko dwa razy. Instanceof sprawdza czy dany obiekt nalezy do danej klasy
                {
                    ((Pracownik)person).pobierzOpis(); //((Pracownik)person).pobierzOpis() = rzutowanie w dół
                }
        }
    }
}


abstract class Osoba {
     String imie;
     String nazwisko;


    Osoba(String  imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    abstract void pobierzOpis();
}

class Pracownik extends Osoba {
    double wynagrodzenie;

    Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }


    @Override
    void pobierzOpis() {

        System.out.println("Jestem pracownicz");
        System.out.println("Nazywam się " + imie);
        System.out.println("Nazwisko to " + nazwisko);
        System.out.println("Zarabiam " + wynagrodzenie + " zł jestem kurwa kimś! Jestem kimś kurwa!");
    }

    void pracuj() {
        System.out.println("Ja pracowacz");
    }
}

class Student extends Osoba {

    Student(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    void pobierzOpis() {

        System.out.println("Jestem Sztudent");
        System.out.println("Nazywam się " + imie);
        System.out.println("Nazwisko to " + nazwisko);
    }

}
