package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date d= new Date();
		System.out.println("Date: "+d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String sd=sdf.format(d);
		System.out.println(sd);
		
		
		//convert string into date-->
		String dd="26/08/20122";
	

}
}
