package polymorphism.returntype;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		double area = Shape.PI*radius*radius;
		return area;
	}
	
	

}
