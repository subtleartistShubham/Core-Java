package polymorphism;

public class Circle extends Shape {
	private int radius;
	
	public Circle() {}
	public Circle(int r) {
		radius =r;
	}
	public double area() {
		double area = PI*radius*radius;
		return area;
	}

}
