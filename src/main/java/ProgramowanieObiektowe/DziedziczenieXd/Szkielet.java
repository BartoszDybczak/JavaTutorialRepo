package ProgramowanieObiektowe.DziedziczenieXd;

public class Szkielet extends Potwór {

    protected String typBroni;

    public Szkielet() {
        System.out.println("Wywołano domyślny konstruktor klasy Szkielet");
    }

    public Szkielet(double prędkośćPoruszaniaSię, double żywotność) {
        super(prędkośćPoruszaniaSię, żywotność);
    }

    public Szkielet(double prędkośćPoruszaniaSię, double żywotność, String typBroni) {
        super(prędkośćPoruszaniaSię, żywotność); // odwołanie do konstruktora klasy rodzica
        this.typBroni = typBroni;
        System.out.println("Wywołano niedomyślny konstruktor klasy Szkielet");
    }

    @Override
    public void atakuj() {

         /*
            Bazowe instrukcje ataku z klasy potwór:
         */

//        super.atakuj();

        /*
            Dodatkowe instrukcje ataku specyficzne dla klasy szkielet:
         */


        System.out.println("To jest metoda atakuj z klasy Szkielet");

    }
}