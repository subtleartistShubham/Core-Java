package Oops;

public class TestTRiangle {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.setBase(4);
		t.setHeight(10);
		t.setColor("Cyan");
		t.setBorderWidth(9);
		
				
		
		double arr =t.area();
		System.out.println("Area OF traiangle: "+ t.area());
		System.out.println("border width : "+ t.getBorderWidth());
		System.out.println("Color :"+ t.getColor());
		
	}

}
