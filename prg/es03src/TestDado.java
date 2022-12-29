package prg.es03;

public class TestDado{
	public static void main(String args[]){
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		int[] hist = new int[13];
		for(int i=0; i<hist.length; ++i) hist[i]=0;
		
		for(int i=0; i<100; ++i){
			if(d1.lancia()==6 && d2.lancia()==6)
				System.out.println("12!!!"); 
		}
		for(int i=0; i<10000; ++i){
			hist[d1.lancia()+d2.lancia()]++;
		}
		
		for(int i=0; i<hist.length; ++i) 
			System.out.println(i + " - " + hist[i]);
	}
}
