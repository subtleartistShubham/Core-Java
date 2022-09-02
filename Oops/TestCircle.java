package Oops;

public class TestCircle {
	public static void main(String[] args) {
		Circle c= new Circle();
		
		c.setRadius(7);
		c.setBorderwidth(9);
		c.setColor("magenta");
		
		double arr = c.area();
	System.out.println(c.getColor());
	System.out.println(c.getBorderwidth());
	System.out.println(arr);
	
	
	
	
	}

}
