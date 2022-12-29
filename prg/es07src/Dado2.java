package prg.es07;

public class Dado2 extends Randomizzatore {
    private static final int SIDES = 6;
    private static final int NMAX = 60;

    public Dado2(){

    }

    public void lancia(){
        int limit = (int)(Math.random()*NMAX+1);
        int stampa = 1;
        int i = 0;
        while(i <= limit){
            System.out.print(stampa + " ");
            ++stampa;
            if(stampa>SIDES){
                stampa = 1;
            }
            ++i;
        }
        return;
    }

}
