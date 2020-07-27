package ProgramowanieObiektowe;

public class Butelka {

    private double ileLitrów;
    private double pojemnosc;

    Butelka() {
    }

    Butelka(double ileLitrów, double pojemnosc) {

        this.ileLitrów = ileLitrów;
        this.pojemnosc = pojemnosc;

    }

    double getIleLitrów() {
        return ileLitrów;
    }

    double getPojemnosc() {
        return pojemnosc;
    }

    public void wlej(double ilosc) {

        if (ilosc > pojemnosc) {
            System.out.println("Chcesz wlać za dużo do butelki! Pojemność to: " + pojemnosc + " a chcesz wlac " + ilosc);
        }

       this.ileLitrów = ileLitrów + ilosc;
    }

    public boolean wylej(double ilosc) {

        if (ilosc < ileLitrów)
            this.ileLitrów = ileLitrów - ilosc;
        else
            return false;

        return true;
    }

    void przelej(double ilosc, Butelka gdziePrzelać) {

        if (this.wylej(ilosc)) {
            gdziePrzelać.wlej(ilosc);
        } else
            System.out.println("za mało");
    }


    public static void main(String[] args) {


        Butelka k = new Butelka(5,3);
        Butelka k2 = new Butelka(10, 8);

//        Butelka[] butelka = new Butelka[3]; // Null
//
//        butelka[0] = new Butelka(5, 4);
//        butelka[1] = new Butelka(7, 9);
//
//        butelka[0].wlej(20);
//
//        butelka[0].przelej(2,butelka[1]);
//
//        System.out.println(butelka[1].getIleLitrów());

//        for (int i = 0; i < butelka.length; i++) {
//            butelka[i] = new Butelka();
//        }

//        System.out.println(butelka[0].getIleLitrów());
//        System.out.println(butelka[1].getIleLitrów());
//        System.out.println(butelka[2].getIleLitrów());
    }
}