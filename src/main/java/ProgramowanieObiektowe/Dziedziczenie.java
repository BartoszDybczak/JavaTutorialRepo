package ProgramowanieObiektowe;

import ProgramowanieObiektowe.DziedziczenieXd.Potwór;
import ProgramowanieObiektowe.DziedziczenieXd.Szkielet;
import ProgramowanieObiektowe.DziedziczenieXd.Zombie;

public class Dziedziczenie {

    public static void main(String[] args) {

        //POTWÓR(KLASA RODZIC, KLASA BAZOWA, SUPERKLASA ->ZOMBIE, SZKIELET (KLASA DZIECKO, KLASA POCHODNA) - zombie i szkielet dziedziczą wszyskie właściwowsci i metdody klasy potwór

        Potwór potwór = new Potwór(10, 100);

        Szkielet szkielet = new Szkielet(20, 50, "Łuk");

        Zombie zombie = new Zombie();

        Potwór p = new Szkielet(10, 100); // Polimorfizm

        System.out.println( potwór.prędkośćPoruszaniaSię);
        System.out.println(szkielet.prędkośćPoruszaniaSię);

        szkielet.atakuj();


    }
}
