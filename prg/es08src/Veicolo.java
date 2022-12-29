package prg.es08;

public abstract class Veicolo {
    private Point2D posizione;
    private Point2D velocitaIniziale;
    private Point2D accelerazione;

    private double tempoTotale;

    public Veicolo(){
        posizione = new Point2D();
        velocitaIniziale = new Point2D();
        accelerazione = new Point2D();
    }

    public abstract void muovi(double t);

    public void incrementoTempoTotale(double t){
        this.tempoTotale += t;
    }

    public double getTempoTotale(){
        return tempoTotale;
    }

    public void setPosizione(double x, double y){
        this.posizione.setX(x);
        this.posizione.setY(y);
    }

    public void setVelocitaIniziale(double x, double y){
        this.velocitaIniziale.setX(x);
        this.velocitaIniziale.setY(y);
    }

    public void setAccelerazione(double x, double y){
        this.accelerazione.setX(x);
        this.accelerazione.setY(y);
    }

    public Point2D getPosizione(){
        return posizione;
    }

    public Point2D getVelocitaIniziale(){
        return velocitaIniziale;
    }

    public Point2D getAccelerazione(){
        return accelerazione;
    }

    public String toString(){
        return "Posizione: " + posizione.toString() + ", v0: " + velocitaIniziale.toString() + ", a: " + accelerazione.toString();
    }

}
