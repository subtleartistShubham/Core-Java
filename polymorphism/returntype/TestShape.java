package polymorphism.returntype;

public class TestShape {
	public static void main(String[] args) {
		Shape s=new Shape();
		
		Circle c=(Circle) Shape.getShape(1);
		c.setRadius(6);
		c.area();
		
		Rectangle r= (Rectangle) Shape.getShape(2);
		r.setLen(5);
		r.setWid(6);
		r.area();
		
		Triangle t =(Triangle) Shape.getShape(3);
		t.setBase(6);
		t.setHeight(9);
		t.area();
	System.out.println("Area of circle:"+c.area());
	System.out.println("Area of rectangle: "+r.area());
	System.out.println("Area of triangle: "+ t.area());
		
		
		
		
		
		
		
	}
	

}
