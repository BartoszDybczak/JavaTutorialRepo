package Pętle;

public class PętlaWhile {

    public static void main(String[] args) {

        String [] kursyProgramowania = {

                "Java",
                "Java Aplikancje",
                "Java Strumienie",
                "Java Aspekty Zaawansowane",
                "Java Android",
                "C#",
                "C# Tworzenie Aplikancji"
        };

        int i = 0;
        while (i < kursyProgramowania.length) {

            if (i != 3) {
                System.out.println(kursyProgramowania[i]);
            }
            i++;
        }

        //do while

        i = 0;

        do {
            System.out.println(kursyProgramowania[i]);

            i++;
        } while (i < kursyProgramowania.length);
    }
}