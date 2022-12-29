// Basato su soluzione esercizio 4 di Francesco La Barbera
package prg.es05;

public class TestDate {
    

    public static void main(String[] args) {

        Date date1 = new Date(234,1992);
        Date date2 = new Date(22,8,1992);
        Date date3 = new Date(22, "August", 1992);

        System.out.println(date1.print1());
        System.out.println(date2.print1());
        System.out.println(date3.print1());
        System.out.println(date1.print2());
        System.out.println(date2.print2());
        System.out.println(date3.print2());
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    } 
}