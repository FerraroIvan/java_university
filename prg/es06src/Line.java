package prg.es06;

public class Line{
	private Point2D p1, p2;
	
	public Line(){
		this(0, 0, 1, 1);
	}
	
	public Line(Point2D a, Point2D b){
		this(a.getX(), a.getY(), b.getX(), b.getY());
	}
	
	public Line(int x1, int y1, int x2, int y2){
		setP1(x1, y1);
		setP2(x2, y2);
	}
	
	public Point2D getP1(){
		return p1;
	}
	
	public int getP1x(){
		return p1.getX();
	}
	
	public int getP1y(){
		return p1.getY();
	}
	
	public void setP1(Point2D p1){
		this.p1 = new Point2D(p1.getX(), p1.getY());
	}
	
	public void setP1(int x, int y){
		this.p1 = new Point2D(x, y);
	}
	
	public Point2D getP2(){
		return p2;
	}
	
	public int getP2x(){
		return p2.getX();
	}
	
	public int getP2y(){
		return p2.getY();
	}
	
	public void setP2(Point2D p2){
		this.p2 = new Point2D(p2.getX(), p2.getY());
	}
	
	public void setP2(int x, int y){
		this.p2 = new Point2D(x, y);
	}
	
	public String toString(){
		return "[" + p1 + "; " + p2 + "]";
	}
}