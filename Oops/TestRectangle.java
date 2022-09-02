package Oops;

public class TestRectangle {
public static void main(String[] args) {
	Rectangle r = new Rectangle();
	r.setLen(70);
	r.setWid(90);
	r.setBorderwidth(8);
	r.setColor("violet");
	
	double arr=r.area();
	System.out.println(arr);
	System.out.println(r.getColor());
	System.out.println(r.getBorderwidth());
			
	
	
}
		
	

}
