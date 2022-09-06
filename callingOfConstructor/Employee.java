package callingOfConstructor;

public class Employee extends Person{
	private String designation;
	public Employee() {
		// TODO Auto-generated constructor stub
	System.out.println("Employee Default");
	}
	
	public Employee (String fn,String ln,String dsgn) {
	super(fn,ln);
	designation=dsgn;
	System.out.println("Employee 3 parameter "+fn +" "+ ln+ " "+dsgn);
	
	}
	public static void main(String[] args) {
		Employee e= new Employee("Vijay","Dinanth Chauhan", "Supervisor");
	}

}
