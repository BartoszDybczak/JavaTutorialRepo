package ProgramowanieObiektowe;

public class KlasyZagnieżdżone {

    public static void main(String[] args) {

        KlasaA zewnetrzna = new KlasaA();

        //Żeby wywołać konstruktor z klasy zagnieżdzonej musimy użyć poniższej konstrukcji:
        //Nazwa klasy zewnętrznej (KlasaA) + kropka + nazwa klasy wewnętrznej (KlasaB) = nazwa obiektu klasy zewnętrznej (zewnetrzna) + kropka + new + konstruktor klasy zagniezdzonej (KasaB)
        KlasaA.KlasaB wewnetrzna = zewnetrzna.new KlasaB();


        //Zagnieżdżone klasy statyczne nie muszą korzystać z powyższej konstrukcji zeby moc wywolac ich konstruktor
       KlasaA.KlasaC klasaWewnetrznaC = new KlasaA.KlasaC();

    }
}

class KlasaA {


    KlasaA() {
        System.out.println("Jestem z klasy zewnętrznej A");
    }


    class KlasaB {

        KlasaB() {
            System.out.println("Jestem z klasy zagnieżdzonej B");
        }

        void metodaTestowa() {
            test = 5;

        }

        private int tmp; // właściwość tmp NIE JEST dostępna w KlasieA (nie jest dostępna w klasie zewnętrznej)
    }

   static class KlasaC {
        KlasaC() {
            System.out.println("Jestem z klasy zagnieżdzonej C");
        }
   }


    private int test; // właściwość test będzie dostępna w klasie zagnieżdzonej pomimo tego ze jest private


    void metodaTestowa2() {

        KlasaB obiekt = new KlasaB();


    }

}


