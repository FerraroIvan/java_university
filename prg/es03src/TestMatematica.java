package prg.es03;

public class TestMatematica {
    public static void main(String[] args) {
        //istanzi un oggetto miaCalcolatrice della classe Calcolatrice
        Calcolatrice miaCalcolatrice = new Calcolatrice();

        //utilizzi l'oggetto miaCalcolatrice per generare 3 vettori: v1 e v2 di dimensione 3 e v3 di dimensione 5
        double[] v1 = miaCalcolatrice.generaVettore(3);
		System.out.println("v1:");
		miaCalcolatrice.stampaVettore(v1);
		
        double[] v2 = miaCalcolatrice.generaVettore(3);
		System.out.println("v2:");
		miaCalcolatrice.stampaVettore(v2);

        double[] v3 = miaCalcolatrice.generaVettore(5);
		System.out.println("v3:");
		miaCalcolatrice.stampaVettore(v3);
        
        //utilizzando i metodi dell'oggetto miaCalcolatrice, sommi v1 e v2, sommi v1 e v3, concateni v1 e v3 e stampi i risultati ottenuti.
        double[] sum1 = miaCalcolatrice.sommaVettori(v1, v2);
        double[] sum2 = miaCalcolatrice.sommaVettori(v1, v3);
        double[] conc = miaCalcolatrice.concatenaVettori(v1, v3);

        
		System.out.println("v1+v2:");
        miaCalcolatrice.stampaVettore(sum1);
		System.out.println("v1+v3:");
        miaCalcolatrice.stampaVettore(sum2);
		System.out.println("Conc:");
        miaCalcolatrice.stampaVettore(conc);
		
		System.out.println("-----------------------------------------------------");
        //utilizzi l'oggetto miaCalcolatrice per generare 3 matrici m1,m2 e m3 di dimensione 3x5.
        double[][] m1 = miaCalcolatrice.generaMatrice(3, 5);
		miaCalcolatrice.stampaMatrice(m1);
        double[][] m2 = miaCalcolatrice.generaMatrice(3, 5);
		miaCalcolatrice.stampaMatrice(m2);
        double[][] m3 = miaCalcolatrice.generaMatrice(6, 4); // verfico cosa succede con una matrice diversa da una 3x5
		miaCalcolatrice.stampaMatrice(m3);
        
        //utilizzando i metodi dell'oggetto miaCalcolatrice, sommi m1 e m2, e m1 e m3 e stampi i risultati ottenuti.
        double[][] matrixSum1 = miaCalcolatrice.sommaMatrici(m1, m2);
        miaCalcolatrice.stampaMatrice(matrixSum1);

        double[][] matrixSum2 = miaCalcolatrice.sommaMatrici(m3, m1);
        miaCalcolatrice.stampaMatrice(matrixSum2);

    }
}
