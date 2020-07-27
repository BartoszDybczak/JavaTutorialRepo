package ProgramowanieObiektowe;

public class KlasaObject {

    public static void main(String[] args) {

        Object[] punkty = new KlasaTest[4];

        punkty[0] = new KlasaTest(2, 8);
        punkty[1] = new KlasaTest(4, 8);
        punkty[2] = new KlasaTest(7, 8);
        punkty[3] = new KlasaTest(14, 88);

        for (int i = 0; i < punkty.length; i++) {

            System.out.println(punkty[i].toString());

        }
    }
}


class KlasaTest {
    private int a;
    private int b;

    KlasaTest() {

    }

    KlasaTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getA() {
        return a;
    }

    int getB() {
        return  b;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null) {
           return false;
        }

        if (this == o) {
            return true;
        }

        if (this.getClass() != o.getClass()) {
            return false;
        }

       KlasaTest przysłanyObiekt = (KlasaTest)o;

       if (this.a == przysłanyObiekt.a && this.b == przysłanyObiekt.b) {
           return true;
       }
        return false;
    }

    @Override
    public String toString() {
        return getA() + " " + getB();
    }
}