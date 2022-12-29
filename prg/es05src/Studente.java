// Basato su soluzione esercizio 5 di Francesco La Barbera
package prg.es05;

public class Studente {

    //CONTROLLO SUI SETTER NON FATTO PERCHE' IN MANCANZA DI EXCEPTION
    String name;
    String surname;
    Date birthdate;
    long matricola;

    public Studente() {}

    public Studente(String name,  String surname, Date birthdate, long matricola) {
        setName(name);
        setSurname(surname);
        setBirthdate(birthdate);
        setMatricola(matricola);
    } 

    public Studente (String name, String surname, int day, int month, int year, int matricola) {
        setName(name);
        setSurname(surname);
        setBirthdate(new Date(day, month, year));
        setMatricola(matricola);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public long getMatricola() {
        return this.matricola;
    }

    public void setMatricola(long matricola) {
        this.matricola = matricola;
    }

    public String toString() {
        return this.name + " " + this.surname + "\nNato il " + this.birthdate + "\nMatricola: " + this.matricola;
    }
}