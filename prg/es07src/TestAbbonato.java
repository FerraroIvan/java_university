package prg.es07;
import java.util.Scanner;


public class TestAbbonato{
    public static void main(String[] args) {
        Servizio2 sky = new Servizio2();

        sky.addAbbonato(new Abbonato("Mattia", "Mirano", 43));
        sky.addAbbonato(new Abbonato("Giovanni", "Franceschini", 24));
        sky.addAbbonato(new Abbonato("Ivan", "Ferraro", 22));

        sky.addAbbonatoPremium(new AbbonatoPremium("Matteo", "Cataldo", 27));
        sky.addAbbonatoPremium(new AbbonatoPremium("Carlotta", "Ferraro", 27));
        sky.addAbbonatoPremium(new AbbonatoPremium("Marika", "Pizzo", 27));

        Scanner scanner = new Scanner(System.in);
        int scelta = 0;
        String nome, cognome;
        int eta;

		do{
			System.out.println("\n\n\n\n----------------\nMenù\n----------------\n");
			System.out.println("\n 1 - Aggiungi abbonato\n 2 - Aggiungi abbonato premium\n 3 - Acquista\n 4 - Stampa Abbonati\n 0 - Esci\n\n\n");
			scelta = scanner.nextInt();
			scanner.nextLine(); // toglie il ritorno a capo dopo l'int dallo scanner
			switch(scelta){
				case 1:
					System.out.print("Nome : ");
					nome = scanner.nextLine();
					System.out.print("Cognome : ");
					cognome = scanner.nextLine();
					System.out.print("Età : ");
					eta = scanner.nextInt();
					sky.addAbbonato(new Abbonato(nome,cognome,eta));
					break;

				case 2:
					System.out.print("Nome : ");
					nome = scanner.nextLine();
					System.out.print("Cognome : ");
					cognome = scanner.nextLine();
					System.out.print("Età : ");
					eta = scanner.nextInt();
					sky.addAbbonatoPremium(new AbbonatoPremium(nome,cognome,eta));
					break;

				case 3:
					System.out.print("Inserisci 1 per abbonato o 2 per abbonato premium: ");
					String tipo = scanner.nextLine();
					if(tipo.equals("1")){
						sky.stampaAbbonati();
						System.out.print("Inserisci id e importo: ");
						int id = scanner.nextInt();
						int importo = scanner.nextInt();
						System.out.println("Pagare " + sky.getAbbonato(id).buy(importo));
					} else {
						sky.stampaAbbonatiPremium();
						System.out.print("Inserisci id e importo: ");
						int id = scanner.nextInt();
						int importo = scanner.nextInt();
						System.out.println("Pagare " + sky.getAbbonatoPremium(id).buy(importo));
					}
					break;

				case 4:
					sky.stampaAbbonati();
					sky.stampaAbbonatiPremium();
					break;

				case 0:
					break;
					
				default:
					System.out.println("L'opzione non è disponibile, reinserire opzione disponibile.");
					break;
			}			
		}while(scelta != 0);
		System.out.println("Grazie ed arrivederci");
    }
}
