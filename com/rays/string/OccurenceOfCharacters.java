package com.rays.string;

public class OccurenceOfCharacters {
	public static void main(String[] args) {
		String name="Vijay Dinanath Chauhan";
	    char ch = 0;
	    for (int i = 0; i < name.length(); i++) {
			//ch=name.charAt(i);
			int count=0;
			for (int j = 0; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					count++;
				}
				
				
			}System.out.println("count "+name.charAt(i) +" "+ count);
		}
		
	}

}
