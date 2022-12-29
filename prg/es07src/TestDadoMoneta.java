package prg.es07;

public class TestDadoMoneta {
    public static void main(String[] args) {
        Dado2 d1 = new Dado2();
        Dado2 d2 = new Dado2();

        Moneta2 m1 = new Moneta2();
        Moneta2 m2 = new Moneta2();

        System.out.println("\n\n\nDado 1 : ");
        d1.lancia();

        System.out.println("\n\n\nDado 2 : ");
        d2.lancia();

        System.out.println("\n\n\nMoneta 1 : ");
        m1.lancia();

        System.out.println("\n\n\nMoneta 2 : ");
        m2.lancia();

    }
}
