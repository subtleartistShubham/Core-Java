package polymorphism;

public class TestShape {
	public static void main(String[] args) {
		Shape s= new Circle(8);
		s.setBorderWidth(8);
		s.setColor("magenta");
		double arr=s.area();
		
		System.out.println("Area Of Circle "+ s.area());
		System.out.println(s.getColor());

		System.out.println(s.getBorderWidth());
		
		
		
	
	Shape s1= new Rectangle(3,4);
	double rarr=s1.area();
	System.out.println("Area of Rectangle "+s1.area());
	
	Shape s2=new Triangle(10,2);
	double tarr=s2.area();
	System.out.println("Area of Triangle: "+s2.area());
	
	//Polymorphism in array
	
	Shape []s3= new Shape [3];
	s3[0]=new Circle(5);
	s3[1]=new Rectangle(6,7);
	s3[2]=new Triangle(10,2);
	//System.out.println("Area of circle : "+s3[0].area());
	//System.out.println("Area of Rectangle: "+s3[1].area());
	//System.out.println("Area of Triangle: "+s3[2].area());
	//for (int i = 0; i < s3.length; i++) {
		//System.out.println(s3[i].area());
	
	
	double tarea=calcArea(s3);
	System.out.println(tarea);
	
	}

	private static double calcArea(Shape[] s3) {
		double tarea=0;
		for (int i = 0; i < s3.length; i++) {
			tarea=tarea+s3[i].area();
			
			
		}
		return tarea;
	}
	
	
	}


