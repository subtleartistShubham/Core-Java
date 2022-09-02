package com.rays.string;

public class TestStringBuffer {
	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Vijay");
	System.out.println(sb.append(" Dinanath Chauhan"));
	System.out.println("Length:" + sb.length());
	System.out.println("Capacity:"+ sb.capacity());
System.out.println("Char At:" + sb.charAt(1));
System.out.println("Index Of:" + sb.indexOf("Dinanath"));
System.out.println("Replace:" + sb.replace(0,2, "jay"));
System.out.println("Reverse:" + sb.reverse());
}

}
