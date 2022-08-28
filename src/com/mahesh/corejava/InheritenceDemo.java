package com.mahesh.corejava;

class Friends
{
	public void ravi()
	{
	System.out.println("PC: ravi");
	}
	public void revan()
	{
	System.out.println("PC: revan");
	}
}

class Sisters extends Friends
{
	public void rohi()
	{
	System.out.println("CC: rohi");
	}
	public void kethu()
	{
	System.out.println("CC: kethu");
	}
}
class Bestie extends Sisters
{
	public void lucky()
	{
	System.out.println("CCC: Lucky");
	}


}

/* by using Inheritence we can create child class from parent class
 and also we can execute parent class by creating object to child class.
 here i have taken Bestiee as child class2
 */

public class InheritenceDemo {
public static void main(String[] args) {
	Bestie mahi = new Bestie();
	mahi.lucky();
	mahi.rohi();
	mahi.kethu();
	mahi.ravi();
	mahi.revan();
}
}
