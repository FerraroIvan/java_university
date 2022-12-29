package prg.es09;

public class Razionale extends Numero{
    private int num, den;

    public Razionale(int num, int den){
        setNum(num);
        setDen(den);
    }

    public int getNum(){
        return num;
    }

    public int getDen(){
        return den;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void setDen(int den){
        if(den != 0) this.den = den;
        else throw new ArithmeticException("Non puoi mettere zero a denominatore");
    }

    public Razionale somma(Numero r){
        int n = 0, d = 0;
        if(r instanceof Razionale){
            Razionale t = (Razionale) r;
            d = this.getDen()*t.getDen();
            n = (this.getNum()*t.getNum()) + (t.getNum()*this.getDen());
            return semplifica(n, d);
        }
        return null;
    }

    public Razionale sottrai(Numero r){
        int n = 0, d = 0;
        if(r instanceof Razionale){
            Razionale t = (Razionale) r;
        }
    }

    public void moltiplica(Razionale r){
        int num = this.getNum() * r.getNum();
        int den =
    }


}
