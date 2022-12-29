package prg.es08;

public abstract class Shape implements Drawable, Scalable {
	private String color;
	private boolean filled;

	public Shape(){

	}

	public Shape(String color, boolean filled){
		setColor(color);
		setFilled(filled);
	}

	public boolean isFilled(){
		return filled;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public String toString(){
		return "Color: " + getColor() + ", Filled: " + isFilled();
	}

	public void draw(){
		System.out.println(toString());
	}

	public abstract double area();
	public abstract double perimeter();

}
