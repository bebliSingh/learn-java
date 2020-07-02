package com.Babli.java;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Create int type variable
		int num=10;
		System.out.println("the integer value is: " + num);
		
		//convert in to double type :Implicit type conversion or expanding
		double data = num;
		System.out.println("the double value is: " + data);
		
		//create double type
		
		double dnum=10.99;
		System.out.println("the double value is: " + dnum);
		
		//convert double to int type : Narrowing or explicit type conversion
		int inum=(int)dnum;
		System.out.println("the double value is: " + inum);
		
	}

}
