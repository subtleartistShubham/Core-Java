package polymorphism.abstractclass;

public class Circle extends Shape {
	private int radius;
	public Circle() {}
	public Circle(int r) {
		radius =r;
	}
	

	@Override
	public double area() {
		
		double area = PI*radius*radius;
		return area;
	}
	
	
}
