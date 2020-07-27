package ProgramowanieObiektowe;

public class Enkapsulacja {

    public static void main(String[] args) {

        /*
                Enkapsulacja (hermetyzacja) - pakowanie właściwości w taki sposób żeby nie było do nich
                bezpośredniego dostępu z innych klas
         */

        KontoBankowe oszczędnościowe = new KontoBankowe();

        oszczędnościowe.setSaldo(2137);

        oszczędnościowe.wypłata(1000);

        System.out.println(oszczędnościowe.getSaldo());

        oszczędnościowe.wpłać(2137);

        System.out.println(oszczędnościowe.getSaldo());
    }
}

class KontoBankowe {

    private int saldo;

    KontoBankowe() {
        saldo = 100;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean setSaldo(int saldo) {
        /*
                WARUNKI!!!
         */
        this.saldo = saldo;

        return true;
    }

    public boolean wypłata(int ile) {

        if (saldo < ile) {
            return false;
        } else {
           setSaldo(saldo - ile);
        }
        return true;
    }

    public boolean wpłać(int ile) {

        setSaldo(saldo + ile);

        return true;
    }
}