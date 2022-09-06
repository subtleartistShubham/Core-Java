package callingOfConstructor;

public class Person {
	protected String fname;
	protected String lname;

	protected String address;
	public Person() {
		System.out.println("Person Default");
		
	}
	public Person(String fn,String ln) {
	fname= fn;
	lname=ln;
	System.out.println("Person 2 parameter "+ fn+" "+ ln);
	
	}
	public Person(String fn,String ln, String addr) {
		this(fn,ln);
		address=addr;
		System.out.println("person 3 parameter "+ fn+" "+ ln +" "+ addr);
		
	}
	public static void main(String[] args) {
		Person p= new Person("Vijay","Chauhan","Mumbai");
	}
	
	
	
}
