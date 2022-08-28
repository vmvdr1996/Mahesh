package com.mahesh.corejava;

class TightlyEncasulation
{
	private float pracHrs=9;
	private String result = "hardwork99";
	private float salary= 50000;
	
	public float addition() {
		float result = pracHrs+salary;
		System.out.println("Result is ="+result);
		return result;
	}

	public float getpracHrs()
	{
		return pracHrs;
	}
	public float getsalary()
	{
		return salary;
	}
	public String getresult()
	{
		return result;
	}
	
}


public class TightlyEncasulationDemo {
public static void main(String[] args) {
	TightlyEncasulation M = new TightlyEncasulation();
	System.out.println(M.getresult());
	M.addition();
	
	
	
	
}
}
