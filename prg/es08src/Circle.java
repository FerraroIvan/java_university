package prg.es08;

public class Circle extends Shape {
    private double radius;

    public Circle(){

    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius < 0.0){
            radius = 0.0;
        }
        this.radius = radius;
    }

    @Override
    public String toString(){
        return super.toString() + " ,Radius: " + getRadius();
    }

    @Override
    public double area(){
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * getRadius();
    }

    @Override
    public void scale(double factor){
        setRadius(factor * radius);
    }

}
