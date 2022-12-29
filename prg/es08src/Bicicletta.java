package prg.es08;

public class Bicicletta extends Veicolo {
    private String modello;

    public Bicicletta(){}

    public Bicicletta(Point2D posizione, Point2D velocitaIniziale, Point2D accelerazione, String modello){
        setPosizione(posizione.getX(), posizione.getY());
        setVelocitaIniziale(velocitaIniziale.getX(), velocitaIniziale.getY());
        setAccelerazione(accelerazione.getX(), accelerazione.getY());
        setModello(modello);
    }

    public Bicicletta(double sX, double sY, double vX, double vY, double aX, double aY, String modello){
        setPosizione(sX, sY);
        setVelocitaIniziale(vX, vY);
        setAccelerazione(aX, aY);
        setModello(modello);
    }

    public String getModello(){
        return modello;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void muovi(double t){
        incrementoTempoTotale(t);
        double tempo = getTempoTotale();
        double x = getPosizione().getX() + (getVelocitaIniziale().getX() * tempo) + (getAccelerazione().getX() * t * t);
        double y = Math.cos(x);
        setPosizione(x, y);
    }

    public String toString(){
        return "La bici ha " + super.toString() + " modello: " + getModello();
    }




}
