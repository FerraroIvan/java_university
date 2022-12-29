package prg.es08;


public class VeicoloAMotore extends Veicolo {
	private int cilindrata;

    public VeicoloAMotore(){} 

    public VeicoloAMotore(Point2D posizione, Point2D velocitaIniziale, Point2D accelerazione, int cilindrata){
        setPosizione(posizione.getX(), posizione.getY());
        setVelocitaIniziale(velocitaIniziale.getX(), velocitaIniziale.getY());
        setAccelerazione(accelerazione.getX(), accelerazione.getY());
        setCilindrata(cilindrata);
    }

    public VeicoloAMotore(double sX, double sY, double vX, double vY, double aX, double aY, int cilindrata){
        setPosizione(sX, sY);
        setVelocitaIniziale(vX, vY);
        setAccelerazione(aX, aY);
        setCilindrata(cilindrata);
    }

    public int getCilindrata(){
        return cilindrata;
    }

    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }

    public void muovi(double t){
        incrementoTempoTotale(t);
        double tempo = getTempoTotale();
        double x = getPosizione().getX() + (getVelocitaIniziale().getX() * tempo) + (getAccelerazione().getX() * t * t); 
        double y = getPosizione().getY() + (getVelocitaIniziale().getY() * tempo) + (getAccelerazione().getY() * t * t); 
        setPosizione(x, y);
    }

    public String toString(){
        return super.toString() + ", Cilindrata: " + getCilindrata();
    }


	
}


