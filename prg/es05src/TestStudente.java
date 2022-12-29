// Basato su soluzione esercizio 5 di Francesco La Barbera
package prg.es05;

public class TestStudente {
    
    public static void main(String[] args) {
        Studente stud1 = new Studente("Richard","Stallman", 12, 11, 1957, 456372);
        Studente stud2 = new Studente("Massimiliano","Jobs", 24, 2, 1934, 456373);
		
		Date d = new Date(24, 2, 1934);
        Studente stud3 = new Studente("Massimiliano", "Jobs", d, 456373);

        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);
    }
}