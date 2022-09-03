package polymorphism.abstractclass;

public abstract class Shape {
	private String color;
	private int radius;
	private int borderWidth;
	public static final float PI=3.14f;
	public abstract double area();
		
	
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

	
	


}
