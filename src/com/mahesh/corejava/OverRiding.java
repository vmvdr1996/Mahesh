package com.mahesh.corejava;

class parent
{
	
	public static void mahesh()
	{
		System.out.println("PC: Mahesh");
		
		/*if we static the int comes under method hiding
		 if we dont use static the it is over riding
		@override is optional*/
		
	}	
	protected void lucky()
	{
		System.out.println("PC: Lucky");
	}

	/*private-->default-->protected-->public
	private is smallest and public is biggest*/
}
class child extends parent
{
	//we can use final in child class only
	
	public static void mahesh()
	{
		System.out.println("CC: Mahesh");
	}	
	public void lucky()
	{
		System.out.println("CC: Lucky");
	}
	public void child1()
	{
		System.out.println("CC: OurChild 1");
	}
}
public class OverRiding {
public static void main(String[] args) {
	child mdl = new child();
	mdl.child1();
	mdl.lucky();
	mdl.mahesh();
}
}
