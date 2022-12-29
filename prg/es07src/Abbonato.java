package prg.es07;
import prg.es05.Persona;

public class Abbonato extends Persona {
    private double discount = 0.05;

    public Abbonato(){
    }

    public Abbonato(Persona persona){
        this(persona.getName(), persona.getSurname(), persona.getEta());
    }
    public Abbonato(String n, String s, int a){
        super(n, s, a);
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }


    public boolean equals(Abbonato ab){
        return  (this.getName().equals(ab.getName()) &&
                this.getSurname().equals(ab.getSurname()) &&
                this.getEta()==ab.getEta());
    }

    public double buy(double price){
        return price*(1.0 - discount);
    }

    public String toString(){
        return super.toString() + " Discount: " + this.discount*100 + "%";
    }


}
