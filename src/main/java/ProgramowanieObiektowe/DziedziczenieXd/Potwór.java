package ProgramowanieObiektowe.DziedziczenieXd;

public class Potwór {

    public double prędkośćPoruszaniaSię = 10;
    public double żywotność;

    public Potwór() {
        System.out.println("Wywołano domyślny konstruktor klasy potwór");
    }

    public Potwór(double prędkośćPoruszaniaSię, double żywotność) {

        this.prędkośćPoruszaniaSię = prędkośćPoruszaniaSię;
        this.żywotność = żywotność;

        System.out.println("Wywołano niedomyślny konstruktor klasy potwór");

    }

    public void atakuj() {
        /*

         */

        System.out.println("To jest metoda atakuj z klasy potwór");
    }
}