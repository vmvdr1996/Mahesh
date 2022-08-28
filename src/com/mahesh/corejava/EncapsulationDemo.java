package com.mahesh.corejava;
class Encapsultion
/* Encapsulation means Wrapping Data. By using encapsulation
	we can change the values of variables even in main method also*/ 
{
	int pracHrs=9;
	String result = "hardwork99";
	public void hello() {
		System.out.println(result + "  " + pracHrs);
	}
}



public class EncapsulationDemo {
public static void main(String[] args) {
	Encapsultion mahi = new Encapsultion();
	mahi.hello();
	mahi.pracHrs=2;
	mahi.result="lucky96";
	mahi.hello();
}

}