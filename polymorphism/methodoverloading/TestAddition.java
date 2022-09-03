package polymorphism.methodoverloading;

public class TestAddition {
public static void main(String[] args) {
	Addition a= new Addition();
	a.add(4, 5);
	a.add(5.6, 7);
	a.add(6, 9, 5);
	a.add("SITA", "RAM");
	
	
	
}
}
