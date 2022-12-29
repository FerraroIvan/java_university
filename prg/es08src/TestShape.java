package prg.es08;

public class TestShape{
	public static void main(String[] args) {
		Shape sh;

		Circle c1 = new Circle("red", true, 1.5);
		Circle c2 = new Circle("blue", true, -1.5);

		System.out.println("Circle 1: ");
		System.out.println(c1);
		System.out.println("Area: " + c1.area());
		c2.setRadius(3.0);
		System.out.println();
		System.out.println("Circle 2: ");
		System.out.println(c2);
		System.out.println("Perimeter " + c2.perimeter());

		Rectangle r2 = new Rectangle();
		Rectangle r1 = new Rectangle("gray", true, 2.0, 4.0);

		System.out.println();
		System.out.println("Rectangle 1: ");
		System.out.println(r1);
		System.out.println("Area " + r1.area());
		System.out.println("Perimeter " + r1.perimeter());
		System.out.println();
		System.out.println("Rectangle 2: ");
		System.out.println(r2);
		r2.setWidth(10.0);
		r2.setLength(5.0);
		System.out.println(r2);

		Square s = new Square("purple", false, 3.5);
		System.out.println();
		System.out.println("Square: ");
		System.out.println(s);
		s.setWidth(35.0);
		System.out.println(s);
		s.setSide(20.0);
		System.out.println("Area: " + s.area());
		System.out.println("==========================================");

		sh = c1;
		System.out.println(sh.area());
		sh = r1;
		System.out.println(sh.area());
	}
}