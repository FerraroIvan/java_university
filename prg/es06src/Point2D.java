package prg.es06;

public class Point2D{
	private int x, y;
	
	public Point2D(){
		this(1, 1);
	}
	
	public Point2D(int x, int y){
		set(x, y);
	}
	
	public void set(int x, int y){
		setX(x);
		setY(y);
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String toString(){
		return "(" + getX() + ", " + getY()+ ")";
	}
	
	public boolean equals(Object altro){
		Point2D a = (Point2D) altro;
		return (this.getX()==a.getX() && this.getY()==a.getY());
	}
}