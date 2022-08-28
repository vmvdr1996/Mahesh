package com.mahesh.corejava;

class Pojo
{
private int numberOne;
private int numberTwo;
private char abcd;

public void setNumberOne (int numberOne)
{
	this.numberOne = numberOne;
	}
public void setNumberTwo (int numberTwo)
{
	this.numberTwo = numberTwo;
	}
public void setABCD (char abcd)
{
	this.abcd =abcd;
	}
public int getNumberOne()
{
return numberOne;
}
public int getNumberTwo()
{
return numberTwo;
}
public char getABCD()
{
return abcd;
}




}




public class PojoDemo {
	public static void main(String[] args) {
Pojo mahi = new Pojo();
mahi.setNumberOne(9);
mahi.setNumberTwo(6);
mahi.setABCD('l');
System.out.println(mahi.getNumberOne());
System.out.println(mahi.getNumberTwo());	
System.out.println(mahi.getABCD());
	}

}
