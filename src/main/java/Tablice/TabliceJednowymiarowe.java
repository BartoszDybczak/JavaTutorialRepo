package Tablice;

public class TabliceJednowymiarowe {

    public static void main(String[] args) {


        int[] tablica = new int[5000];

        tablica[0] = 20;
        tablica[1] = 7;
        tablica[2] = 27;
        tablica[3] = 15;
        tablica[4] = 77;
        //tablica[5] = 124 - nie przypiszemy wartosci do tablica[5] bo liczy sie od 0

        System.out.println(tablica[0]);

        int[] tab2 = {1, 14, 15, 21, 37, 6}; // szybszy sposób na tworzenie tablicy

        System.out.println(tab2[tab2.length - 1]);


        /*
                Tablice
                -----------------------------------------------------------------------

                tablica[0]   tablica[1]  tablica[2]  tablica[3]  tablica[4]  tablica[5]


                -----------------------------------------------------------------------
         */


    }
}
