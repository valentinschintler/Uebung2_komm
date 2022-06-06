public class TurmDemo {

    public static void main(String[] args) {

        int zahl1 = 2;
        int zahl2 = 2;
        int ergebnis;

        while (zahl1 <= 9) {
            ergebnis = zahl1 * zahl2;
            System.out.println(zahl2 + " * " + zahl1 + " = " + ergebnis);
            zahl2 = ergebnis;
            zahl1++;

        }
    }
}
