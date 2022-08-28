package com.mahesh.corejava;
interface IntDemo
{
	void child();
	public abstract void hello();
	abstract void mummy();
	public void daddy();
	void family();
	void friends();
	String name = "Human";
	/* Here we have added the Static method in the interface
	 * we can access it only by calling it with interfaceName.methodName
	 * we can not access it in class on with className
	 * We can not override it in any class (abstract and fullyloaded class)
	 */
	public static void life() 
	{
		System.out.println("Life is Beautiful");	
		/* Here we have added the default method in the interface
		 * we can access it  by calling it with child class objectName.Method Name
		 * We can override it in any class (abstract and fullyloaded class)
		 */
	}
	default void success() 
	{
		System.out.println("Success comes with Hardwork");	
	}
	
}

abstract class IntDemo1 implements IntDemo
{

	@Override
	public void child() {
		System.out.println("Child");
		
	}

	@Override
	public void hello() {
		System.out.println("Hello");
	}

	@Override
	public void mummy() {
	System.out.println("Mummy");	
	}

	@Override
	public void daddy() {
		System.out.println("Daddy");
	}

	@Override
	public void family() {
		System.out.println("Family");
	}

	public void education() {
		System.out.println("Education");
	}
}

class IntDemo2 extends IntDemo1

{

	@Override
	public void friends() {
		System.out.println("Friends");
		
	}
	
	public void hardwork() {
		System.out.println("Hardwork=Job");
	}
	@Override
	public void success() 
	{
		System.out.println("Hadwork is the secret of Success");	
	}
	/*
	 * we can access default methods in child classes also.. 
	 * we should replace default with public in child class...
	 */
}

public class InterfaceDemo {
public static void main(String[] args) {
	
	/*IntDemo mahi = new IntDemo(); ---> Invalid 
	We can not create object for Interface
	
	IntDemo mahi = new IntDemo1(); ---> Invalid 
	IntDemo1 is not fully loaded class or concrete class...
	*/
	
	
	
	// The below written object is VALID
	//we can create object only for fully loaded class...
	//ie: Class name object/varName = new Class name
	
	/*IntDemo2 mahi = new IntDemo2();
	
	mahi.child();
	mahi.hello();
	mahi.mummy();
	mahi.daddy();
	mahi.family();
	mahi.friends();
	mahi.education();
	mahi.hardwork();
	*/

	// Now I want to access Interface Specific Methods
	// Using this i can access only methods written in Interface
	// <InterfaceName> obj/varName = New <fullyimpemented className>

	IntDemo mahi = new IntDemo2();
	mahi.child();
	mahi.hello();
	mahi.mummy();
	mahi.daddy();
	mahi.family();
	mahi.friends();
	IntDemo.life();
	mahi.success();
}
}


