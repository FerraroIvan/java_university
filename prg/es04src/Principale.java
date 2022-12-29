// Soluzione esercizio 2 di Luca Sabatino
package prg.es04;

import java.util.ArrayList;
import prg.es03.Persona;

public class Principale {
    public static void main(String[] args) {
        ArrayList<Persona> miaListaP= new ArrayList<>();

        Persona p1 = new Persona("Luca ", "Sabatino ", 20);
        Persona p2 = new Persona("Dario ", "Bongiorno ", 19);
        Persona p3 = new Persona("Leonardo ", "Rinaldi ", 18);

        miaListaP.add(p1);
        miaListaP.add(p2);
        miaListaP.add(p3);

        System.out.println("La dimensione della lista e " + miaListaP.size());

        System.out.println("L'i-esimo elemento della lista e " + miaListaP.get(2));

        miaListaP.remove(2);

        System.out.println("Contenuto della lista dopo aver rimosso l'i-esimo elemento");
        System.out.println(miaListaP);

		// Stampo anche col ciclo for
        for (int i = 0; i < miaListaP.size(); i++) {
            System.out.println(miaListaP.get(i));
        }

        miaListaP.clear();

        System.out.println("Dimensione lista " + miaListaP.size());
        
       
    }

}