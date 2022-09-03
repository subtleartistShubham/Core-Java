package polymorphism.abstractclass;

public class TestShape {
	public static void main(String[] args) {
		
	
	Shape s= new Triangle(7,74);
	s.setBorderWidth(4);
	s.setColor("black");
	double arr=s.area();
	System.out.println("Area Of Triangle: "+arr);
	System.out.println(s.getBorderWidth());
	System.out.println(s.getColor());
	}
}
