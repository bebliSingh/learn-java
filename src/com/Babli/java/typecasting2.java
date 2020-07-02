package com.Babli.java;

public class typecasting2 {

	public static void main(String[] args) {
		//create int type
		int num = 10;
		System.out.println("The integer value: " +num);
		
		//convert integer to string type value
		String data= String.valueOf(num);
		System.out.println("The string value: " +data);
		
		//create string type value
		String str="103";
		System.out.println("The string value: " +str);
		
		//convert string to integer value
		int inum=Integer.parseInt(str);
		System.out.println("The integer value: " +inum);
		
		//convert string to double value
		double dnum=Double.parseDouble(str);
		System.out.println("The double value: " +dnum);

	}

}
