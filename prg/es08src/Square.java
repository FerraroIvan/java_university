package prg.es08;

public class Square extends Rectangle{
	public Square(){

	}

	public Square(String color, boolean filled, double side){
		super(color, filled, side, side);
	}

	@Override
	public void setWidth(double width){
		super.setWidth(width);
		super.setLength(width);
	}

	@Override
	public void setLength(double length){
		super.setWidth(length);
		super.setLength(length);
	}

	public void setSide(double side){
		setWidth(side);
	}
}