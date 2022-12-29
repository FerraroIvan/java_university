package prg.es06;

public class MainPunto{
	public static void main(String[] args){
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D(3, 5);
		
		System.out.println(p1);
		p1.set(10, 10);
		System.out.println(p1);
		
		System.out.println(p2.getX());
		
		Line l = new Line(p1, p2);
		System.out.println(l);
		l.setP1(0,0);
		System.out.println(l);		
	}
}