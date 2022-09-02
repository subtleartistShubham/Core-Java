package com.rays.basics;

public class SwapingOfNumber {
	public static void main(String[] args) {
		
	
		int x=789;
		int y=986;
		int k;
		
		System.out.println("Before Swapping Numbers are  :" + x +" "+ y );
		k=x;
        x=y;
        y=k;
		
        System.out.println("After Swapping numbers are :"+ x +" "+ y);
	}

}
