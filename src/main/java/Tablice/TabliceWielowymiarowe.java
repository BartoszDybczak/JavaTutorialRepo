package Tablice;

public class TabliceWielowymiarowe {

    public static void main(String[] args) {


        int[][] tablicaDwuwymiarowa = new int[4][3];

        tablicaDwuwymiarowa[0][0] = 25;
        tablicaDwuwymiarowa[3][0] = 70;


        System.out.println(tablicaDwuwymiarowa[3][0]);


        int[][] tab = {
                {4, 8, 17, 9},
                {2,1,3,7},
                {6,9,50,66}
        };

        System.out.println(tab[1][3]);




         /*
                Tablice Wielowymiarowe
                ----------------------------------------
                    {0}{0}    |   {0}{1}    |  {0}{2}  |
                ----------------------------------------

                ---------------------------------------
                   {1}{0}    |   {1}{1}    |  {1}{2}  |
                ---------------------------------------

                ---------------------------------------
                   {2}{0}    |   {2}{1}    |  {2}{2}  |
                ---------------------------------------

                ---------------------------------------
                   {3}{0}    |   {3}{1}    |  {3}{2}  |
                ---------------------------------------


         */
    }
}
