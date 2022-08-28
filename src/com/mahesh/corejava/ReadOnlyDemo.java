package com.mahesh.corejava;
abstract class ReadOnly
{
		static String pracHrs ="5 Hours";
		static String result ="Hardwork";
		public static void lucky() {
			System.out.println(pracHrs+ "  "+result);
		}
}

public class ReadOnlyDemo 
{
public static void main(String[] args) {
	ReadOnly.lucky();		//classname+methodname
	System.out.println(ReadOnly.result);   //classname+variablename
}
}
