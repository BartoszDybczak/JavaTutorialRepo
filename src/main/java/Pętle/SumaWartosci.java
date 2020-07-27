package Pętle;

public class SumaWartosci {

    public static void main(String[] args) {

        int[] liczby = {1, 12, 41, 12, 51, 12};

        int suma = 0;

//          Rozwiązanie przy uzyciu zwykłej pętli
        //        for (int i = 0; i < liczby.length; i++) {
//            suma = suma + liczby[i];
//        }
//

        //Enhanced for loop
        for (int liczba : liczby ) {
            suma = suma + liczba;
        }

        System.out.println(suma);
    }
}
