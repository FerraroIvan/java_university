// Basato su soluzione esercizio 3 di Samuele Lo Cascio
package prg.es05;

public class Razionale{
	private int num;
	private int den = 1;

	//COSTRUTTORI:
	public Razionale(){}

	public Razionale(int num, int den){
		this.setNum(num);
		this.setDen(den);
	}

	//METODI:
	public Razionale setNum(int num){
		this.num = num;
		return this;
	}

	public Razionale setDen(int den){
		if(den != 0){
			this.den = den;
		} else {
			System.out.println("Il denominatore deve essere diverso da zero");
		}
		return this;
	}

	public int getNum(){
		return this.num;
	}

	public int getDen(){
		return this.den;
	}

	// Questo metodo non l'ho controllato ma assumo che sia corretto
	private Razionale reduce(){
		if(this.getNum()==0 || this.getDen()==0){
			System.out.println("Numero non trovato");
			return this;
		}
		int min;
		if(this.num <= this.den){
			min = this.getNum();
		} else {
			min = this.getDen();
		}
		cerca_numeri_primi:
		for(int i = 2; i < min; i++){
			for(int j = 2; j < i; j++){
				if(i%j==0){
					continue cerca_numeri_primi;
				}
			}
			while(this.getNum()%i==0 && this.getDen()%i==0){
				this.setNum(this.getNum()/i);
				this.setDen(this.getDen()/i);
			}
		}
		return this;
	}

	public Razionale sum(Razionale r){
		Razionale result = new Razionale(this.getNum()*r.getDen()+r.getNum()*this.getDen(), this.getDen()*r.getDen());
		return result.reduce();
	}

	public Razionale sub(Razionale r){
		Razionale result = new Razionale(this.getNum()*r.getDen()-r.getNum()*this.getDen(), this.getDen()*r.getDen());
		return result.reduce();
	}

	public Razionale product(Razionale r){
		Razionale result = new Razionale(this.getNum() * r.getNum(), this.getDen() * r.getDen());
		return result.reduce();
	}

	public Razionale divide(Razionale r){
		Razionale result = new Razionale(this.getNum()*r.getDen(), r.getNum()*this.getDen());
		return result.reduce();
	}

	public String toString(){	
		this.reduce();	//Quando il numero viene presentato in output (Stringa o stampato), sar?? sempre ridotto ai minimi temini
		return this.getNum() + "/" + this.getDen();
	}

	public void toPrint(){		//Quando il numero viene presentato in output (Stringa o stampato), sar?? sempre ridotto ai minimi temini (vedi toString)
		System.out.println(this.toString());
	}

}