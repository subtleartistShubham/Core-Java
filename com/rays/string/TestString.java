package com.rays.string;

public class TestString {
	public static void main(String[] args) {
		String name="Vijay Dinanath Chauhan";
		System.out.println(name);
		System.out.println("String Length"+ name.length());
        System.out.println("4th character is "+ name.charAt(4));
        System.out.println("jay index is "+ name.indexOf("jay"));
        System.out.println("first i position "+name.indexOf("i"));
        System.out.println("last i position "+name.lastIndexOf("i"));
        System.out.println("a is replaced by b "+name.replace("a","b"));
        System.out.println("small case of name "+name.toLowerCase());
        System.out.println("upper case of name "+ name.toUpperCase());
        System.out.println("Starts with Vijay or not? "+ name.startsWith("Vijay"));
        System.out.println("ends with han or not?"+name.endsWith("han"));
        System.out.println("Substring"+ name.substring(3));
        
	}
	

}
