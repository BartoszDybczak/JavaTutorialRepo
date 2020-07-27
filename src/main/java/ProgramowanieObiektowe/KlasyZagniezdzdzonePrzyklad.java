package ProgramowanieObiektowe;

public class KlasyZagniezdzdzonePrzyklad {

    public static void main(String[] args) {

        BontoKankowe kontoBankowe = new BontoKankowe(2137);

        System.out.println(kontoBankowe.getStanKonta());


        kontoBankowe.start(5);

        System.out.println(kontoBankowe.getStanKonta());
    }
}

class BontoKankowe {

    private double stanKonta;

    BontoKankowe(double stanKonta) {
        this.stanKonta = stanKonta;

    }

    double getStanKonta() {
        return this.stanKonta;
    }

    //do liczenia odesetek uzyjemy klasy wewnetrznej

    void start(double stopaProcentowa) {

//       class Odsetki {
//
//           private double stopaProcentowa;
//
//           public Odsetki(double stopaProcentowa) {
//               this.stopaProcentowa = stopaProcentowa;
//               this.zmienStanKonta(stopaProcentowa);
//           }
//
//           void zmienStanKonta(double stopaProcentowa) {
//
//               double odsetki = (stanKonta * stopaProcentowa) / 100;
//               stanKonta += odsetki;
//           }
//       }


        Odsetki odsetki = new Odsetki(stopaProcentowa);
    }

    //można wrzucic klase Odsetki bezpośrednio do metody start()

    class Odsetki {

        private double stopaProcentowa;

        public Odsetki(double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta(stopaProcentowa);
        }

        void zmienStanKonta(double stopaProcentowa) {

            double odsetki = (stanKonta * stopaProcentowa) / 100;
            stanKonta += odsetki;
        }
//    }

    }
}


