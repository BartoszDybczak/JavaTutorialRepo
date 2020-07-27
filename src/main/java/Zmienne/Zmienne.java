package Zmienne;

public class Zmienne {

    public static void main(String[] args) {

        //Typy całkowitoliczbowe
        int a = 10;
        int b = 6;
        int c;
        long liczbaLong = 2137990000000000000L;

        //typy znakowe
        char znak = 'A';

        //Typy zmiennoprzecinkowe
        float liczbaZPrzecinkiem = 4.6f;
        double liczbaZPrzecinkiem2 = 4.69;

        c = a + b;

        //Stała - nie mozna przypisac jej innej wartosci niz 3.14
        final double LICZBA_PI = 3.14;

        System.out.println(c);

        /*
                Zmienne - jak nie zapisywac:
                1. Nie olno uzywac java keywords w nazwach zmiennych np. zmienna o nazwie public etc.
                2. Nie wolno zaczynac nazwy zmiennej od liczby np 45Lat
                3. Nie wolno korzystac ze spacji w nazwie zmiennej

                typy danych

                Typy calkowitoliczbowe
                byte 8 bitów = krótszy niz int, typ prymitywny
                short 16 bitów = krótszy niz int, typ prymitywny
                int - 32 bity - liczby całkowite, typ prymitywny
                long - 64 bity - większy zakres niz int, typ prymitywny trzeba dodawac litere L na koncu liczby

                typy znakowe
                char - pojedyncze znaki 2 bajty, trzeba uzywac z ' ' jak uzyjemy "" nie bedzie dzialac
                String - ciąg znaków

                Typy zmiennoprzecinkowe
                float - 32 bity trzeba uzywac litery f na komcu liczby zeby nie mylil z double
                double - 64 bity
         */
    }
}