package Pętle;

public class PętlaFor {

    public static void main(String[] args) {

        String [] kursyProgramowania = {

                "Java",
                "Java Aplikancje",
                "Java Strumienie",
                "Java Aspekty Zaawansowane",
                "Java Android",
                "C#",
                "C# Tworzenie Aplikancji",
                "AutoIT"
        };

        //for (INICJALIZACJA ZMIENNYCH; WARUNEK PĘTLI; INKREMENTACJA)
//        for (int i = 0; i < kursyProgramowania.length; i++) {
//            System.out.println(kursyProgramowania[i]);
//        }

        //ENHANCED FOR LOOP - pętla foreach

        for (String nazwaKursu : kursyProgramowania) {

            System.out.println(nazwaKursu);

        }

    }
}