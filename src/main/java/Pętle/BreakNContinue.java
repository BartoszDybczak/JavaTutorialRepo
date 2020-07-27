package Pętle;

public class BreakNContinue {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            if (i % 2 != 0) {
                continue; //przerwij iteracje od tego momentu i nie wykonuj juz zadnej instrukcji po mnie - nie wydrukuje liczby 3 pominie ja
                //break; zakonczy cala pętle
            }

            System.out.println(i);
        }
    }
}
