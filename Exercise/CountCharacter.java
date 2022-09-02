package Exercise;

public class CountCharacter {
	public static void main(String[] args) {
		String s="Vijay Dinanath Chouhan";
   int totalcount=s.length();
   int totalcount_afterRemove= s.replace("n","").length();
   int count = totalcount-totalcount_afterRemove;
   System.out.println("no. of occurence of D is " +count);
		
		
	}
	
		

}
