package Cloning;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address a= new Address();
		a.setStreet("Bhawarkua");
		a.setCity("Indore");
		a.setState("M.P.");
		
		Employee e= new Employee();
		e.setId(298765435);
		e.setFname("Vijay");
		e.setLname("Dinanath Chauhan");
		e.setAddr(a);
		
		Employee e1= (Employee) e.clone();
		
		System.out.println(e.getId());
		System.out.println(e.getFname());
		System.out.println(e.getLname());
		System.out.println(e.getAddr().getCity());
		System.out.println(e.getAddr().getState());
		
		System.out.println("--------------------");
		
		System.out.println(e1.getId());
		System.out.println(e1.getFname());
		System.out.println(e1.getLname());
		System.out.println(e1.getAddr().getCity());
	}

}
