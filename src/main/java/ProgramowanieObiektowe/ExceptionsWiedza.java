package ProgramowanieObiektowe;

public class ExceptionsWiedza {


    public static void main(String[] args) {


        int a = 10;

        try {

            System.out.println(5/0);
            if (a == 10) {
                throw new NaszWyjątek("a jest ruwne dziesienc chuju - zdechniesz w pierdlu w sztumie chuju");

            }

        } catch (NaszWyjątek chuj) { //Możemy użyć klasy Exception do obsługi NaszegoWyjątku, Jesli uzyjemy exception obsłuzymy WSZYSTKIE wyjątki

            System.out.println(chuj.getMessage());
        }
        catch (ArithmeticException e) { // możemy tez obslugiwac wyjątki po kolei dodając kolejne bloki catch
            System.out.println(e.getMessage());
        }




//        System.out.println(5/0); // dzielenie przez 0 wywali błąd - exception
//
//        try {
//            System.out.println(5/0);
//        }
//        catch (ArithmeticException e) {
////            System.out.println("No chyba Cie pojebalo ze dzielisz przez 0 hihi");
//
//            System.out.println("Powstał wyjątek: " + e.getMessage());
//        }
//        finally {
//            System.out.println("Coś co zawsze zostanie wywolane");
//        }

        /*
            Do obsługi wyjątków używamy bloku try - catch - xd


            try {

                INSTRUKCJE KTÓRE POTENCJALNIE MOGĄ SPOWODOWAĆ BŁĄD
            }
            catch(NazwaZwróconegoWyjątku + nazwa zmiennej (np xd)) {

                 INSTRUKCJE OBSŁUGUJĄCE ZŁAPANY WYJĄTEK
            }

            Jeśli nie znasz nazwy wyjątku, który crashuje program to możesz użyc klasy Exception - wszystkie wyjątki dziedziczą z niej
            Można tez tworzyc wlasne wyjątki
         */

    }
}

class NaszWyjątek extends Exception {

    public NaszWyjątek(String wiadomosc) {

        super(wiadomosc);

    }

}
