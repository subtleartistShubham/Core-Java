package com.rays.string;

public class OccurenceOfEachChar {
	public static void main(String[] args) {
		String name="Vijay Dinanath Chauhan";
		int i,j,count;
		for ( i = 0; i < name.length(); i++) {
			 count=0;
			for ( j = 0; j < name.length(); j++) {
				if(name.charAt(i)==name.charAt(j)){
					count++;
					
					
				}
				
				
			}
			
			System.out.println("count " + name.charAt(j)+" "+count);	
			
		
	}
		
		
		
	}
}
	


