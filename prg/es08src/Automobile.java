package prg.es08;

public class Automobile extends VeicoloAMotore{
    private String numeroTarga;

    public Automobile(){}

    public Automobile(Point2D posizione, Point2D velocitaIniziale, Point2D accelerazione, int cilindrata, String numeroTarga){
        super(posizione, velocitaIniziale, accelerazione, cilindrata);
        setNumeroTarga(numeroTarga);
    }

    public Automobile(double sX, double sY, double vX, double vY, double aX, double aY, int cilindrata, String numeroTarga){
        super(sX, sY, vX, vY, aX, aY, cilindrata);
        setNumeroTarga(numeroTarga);
    }

    public String getNumeroTarga(){
        return numeroTarga;
    }

    public void setNumeroTarga(String numeroTarga){
        this.numeroTarga = numeroTarga;
    }

    public String toString(){
        return "L'auto ha "+super.toString() + " numero di targa: " + getNumeroTarga();
    }




    


}

