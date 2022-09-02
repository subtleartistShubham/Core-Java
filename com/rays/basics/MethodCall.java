package com.rays.basics;

public class MethodCall {
	public void addition() {
	int i=5;
	int j=9;
	int k=i+j;
System.out.println(k);
	}
public void subtraction () {
	int i=10;
	int j=9;
System.out.println(i-j);
}
public int add (int a , int b) {
	int c=a+b;
	return c;
}

public static void main(String[] args) {
	MethodCall m= new MethodCall();
	
	m.addition();
	m.subtraction();
	
	int c=m.add(89, 987);
	System.out.println(c);
}




}
