package prg.es08;

public class Rectangle extends Shape{
	private double width;
	private double length;

	public Rectangle(){}

	public Rectangle(String color, boolean filled, double width, double length){
		super(color, filled);
		setWidth(width);
		setLength(length);
	}

	public double getWidth(){
		return width;
	}

	public double getLength(){
		return length;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public void setLength(double length){
		this.length = length;
	}

	@Override
	public String toString(){
		return super.toString() + ", Width: " + getWidth() + ", Length: " + getLength();
	}

	@Override
	public double area(){
		return getLength()*getWidth();
	}

	@Override
	public double perimeter(){
		return (getLength()*2) + (getWidth()*2);
	}

	@Override
	public void scale(double factor){
		setWidth(width * factor);
		setLength(length * factor);
	}
}