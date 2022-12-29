package prg.es08;

public class Ciclomotore extends VeicoloAMotore{
    private long numeroTelaio;

    public Ciclomotore(){}

    public Ciclomotore(Point2D posizione, Point2D velocitaIniziale, Point2D accelerazione, int cilindrata, long numeroTelaio){
        super(posizione, velocitaIniziale, accelerazione, cilindrata);
        setNumeroTelaio(numeroTelaio);
    }

    public Ciclomotore(double sX, double sY, double vX, double vY, double aX, double aY, int cilindrata, long numeroTelaio){
        super(sX, sY, vX, vY, aX, aY, cilindrata);
        setNumeroTelaio(numeroTelaio);
    }

    public long getNumeroTelaio(){
        return numeroTelaio;
    }

    public void setNumeroTelaio(long numeroTelaio){
        this.numeroTelaio = numeroTelaio;
    }

    public String toString(){
        return "Il ciclomotore ha " + super.toString() + " numero di Telaio: " + getNumeroTelaio(); 
    }
}




