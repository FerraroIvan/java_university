package prg.es03;

public class TestPersona{
	public static void main(String args[]){
		Persona persona1, persona2;
		
		persona1 = new Persona("Mario", "Rossi", 22);

		persona2 = new Persona();
		System.out.println(persona2.toString());
		persona2.nome = "Luigi";
		persona2.cognome = "Neri";
		persona2.eta = 21;
		System.out.println(persona2.toString());
		
		Persona persona3;
		persona3 = persona1;
		
		System.out.println(persona3.toString());
		
		persona3.eta = 35;
		
		System.out.println(persona1.toString());
	}
}
		
		
