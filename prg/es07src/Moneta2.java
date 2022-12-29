package prg.es07;

public class Moneta2 extends Randomizzatore{
    private static final int SIDES = 2;
    private static final int NMAX = 20;

    public Moneta2(){

    }

    public void lancia(){
        int limite = (int)(Math.random()*NMAX+1);
        int i = 1;
        while(i <= limite){
            if(i % SIDES == 0){
                System.out.print("T ");
            } else {
                System.out.print("C ");
            }
            ++i;
        }
    }
}
