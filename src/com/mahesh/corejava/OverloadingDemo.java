package com.mahesh.corejava;

class Overloading
{
	public float addition(float a1,float a2)
	{
	float result=a1+a2;
	System.out.println("Addition values is "+result);
	return result;
	}
	public float subraction(float a1,float a2)
	{
	float result=a1-a2;
	System.out.println("Subraction values is "+result);
	return result;
	}
	public double multiplication(float a1,float a2)
	{
	float result=a1*a2;
	System.out.println("Multiplication values is "+result);
	return result;
	}
	public double division(float a1,float a2)
	{
	float result=a1/a2;
	System.out.println("Division values is "+result);
	return result;
	}
	
}

/*
 Using overloading we can enter values of variables at the
 main method of program
 */

public class OverloadingDemo {
public static void main(String[] args) {
	Overloading mahi = new Overloading();
	mahi.addition(100, 20);
	mahi.subraction(100, 20);
	mahi.multiplication(5, 25.9f);
	mahi.division(5, 3);


}
}