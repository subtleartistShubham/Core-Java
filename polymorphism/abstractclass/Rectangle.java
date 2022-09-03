package polymorphism.abstractclass;

public class Rectangle extends Shape {
	private int len;
	private int wid;
	public Rectangle() {}
	public Rectangle(int l, int b) {
		len=l;
		wid=b;
	}

	@Override
	public double area() {
		double rarr =len*wid;
		return rarr;
		
		
	}
	

}
