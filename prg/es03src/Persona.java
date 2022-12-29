package prg.es03;

public class Persona{
	public String nome, cognome;
	public int eta;
	
	public Persona(){}
	
	public Persona(String n, String c, int e){
		nome = n;
		cognome = c;
		eta = e;
	}
	
	public String toString(){
		return (nome + " " + cognome + "(" + eta + ")");
	}
	
	public boolean equals(Persona altro){
		return (nome.equals(altro.nome) && cognome.equals(altro.cognome) && (eta == altro.eta));
	}
}