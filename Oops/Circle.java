package Oops;

public class Circle extends Shape {
	private int radius;
	private int borderWidth;
	private String Color;
	

	
	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		
		this.radius = radius;
	}




	public double area() {
		double arr=Shape.PI*radius*radius;
		return arr;
		
	}
	

}
