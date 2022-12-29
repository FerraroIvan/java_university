// Basato su soluzione esercizio 4 di Samuele Lo Cascio
// Versione che usa un singleton per l'input
package prg.es06;

// Uso una nuova versione della classe Persona con incapsulamento definita in prg.es04

import java.util.ArrayList;
import prg.es04.Persona;

public class Rubrica{
	public static void main(String[] args) {
		SingleInput input = SingleInput.getInstance();
		ArrayList<Persona> miaLista = new ArrayList<>();
		String key = new String();
		label:
		while(key != "e"){
			System.out.println("MENU:");
			System.out.println("a. Inserisci nuovo utente");
			System.out.println("b. Cerca persona");
			System.out.println("c. Mostra lista");
			System.out.println("d. Cancella tutta la lista");
			System.out.println("e. Esci");

			switch (key = input.readString("> ")) {
				case "a":	//AGGIUNGI PERSONA
					Persona p1 = new Persona();
					p1.setNome(input.readString("Inserisci nome persona: "));
					p1.setCognome(input.readString("Inserisci cognome persona: "));
					p1.setEta(input.readInt("Inserisci eta persona: "));
					miaLista.add(p1);
					System.out.println();
					break;

				case "b":	//CERCA PER NOME
					String a = input.readString("Inserisci nome da cercare: ");
					boolean state = false;
					for(Persona tmp : miaLista){
						if(tmp.getNome().equals(a)){
							state = true;
							System.out.println(tmp.getNome() + " " + tmp.getCognome() + " " + tmp.getEta());
						}
					}
					if(state == false){
						System.out.println("Non e' presente alcuna persona con il nome " + a + " nella lista");
					}
					System.out.println();
					break;

				case "c":	//MOSTRA INTERA LISTA
					for(Persona tmp : miaLista){
						System.out.printf("%s\t%s\t%d\n", tmp.getNome(), tmp.getCognome(), tmp.getEta());
					}
					System.out.println();
					break;

				case "d":	//CANCELLA LISTA
					miaLista.clear();
					System.out.println("Lista cancellata.");
					System.out.println();
					break;

				case "e":	//TERMINA PROGRAMMA
					break label;
			
				default:
					System.out.println("OPZIONE NON VALIDA. Inserire 'a', 'b', 'c', 'd' o 'e'");
					System.out.println();
					break;
			} 
		}
		System.out.println("FINE PROGRAMMA!");
		
	}
}