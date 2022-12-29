package prg.es07;
import prg.es05.Persona;


public class AbbonatoPremium extends Abbonato {
    private final int SPESAB = 100;
    private double spesaC = 0.0;

    public AbbonatoPremium(){}

    public AbbonatoPremium(Persona persona){
        this(persona.getName(), persona.getSurname(), persona.getEta());
    }

    public AbbonatoPremium(String n, String c, int e){
        super(n, c, e);
    }

    public double getBuyC(){
        return this.spesaC;
    }

    public double buy(double price){
        double discountedPrice = super.buy(price);
        spesaC += price;
        if(spesaC/SPESAB > 1){
            discountedPrice = discountedPrice - (5 * ((int)(spesaC/SPESAB)));
            spesaC = spesaC - (100 * ((int)(spesaC/SPESAB)));
        }
        return discountedPrice;
    }

    public String toString(){
        return super.toString() + " Spesa per bonus: " + this.spesaC;
    }

}
