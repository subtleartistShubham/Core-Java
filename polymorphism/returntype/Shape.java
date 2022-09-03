package polymorphism.returntype;

public class Shape {
	private String color;
	private int radius;
	private int borderWidth;
	public static final float PI=3.14f;
	public double area() {
		return 0;
	}
	
	public Shape() {
		
	}
	public Shape(String c, int b) {
		color=c;
		borderWidth=b;
				
	}
	
	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public static float getPi() {
		return PI;
	}
	
	public static Shape getShape(int i) {
		if(i==1) {
			return new Circle();
		}
		if (i==2) {
			return new Rectangle();
		}
		if (i==3) {
			return new Triangle();
		}
		return new Shape();
	}
		
	}



