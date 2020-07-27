package ProgramowanieObiektowe;

public class Konstruktory {

    public static void main(String[] args) {

        Punkt p = new Punkt(10, 155);

        Punkt p2 = new Punkt(10,45);



        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);

        System.out.println("p2.x = " + p2.x);
        System.out.println("p2.y = " + p2.y);
    }
}

class Punkt {

    int x;
    int y;

    //Konstruktor domyślny - nie przyjmuje zadnych parametrów
    Punkt() {
        System.out.println("Wywołano konstruktor domyślny");
    }

    //Konstruktor parametryzowany
    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
