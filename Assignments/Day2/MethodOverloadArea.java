package Assignments.Day2;

import Day3Assignments.StaticMethods;

public class MethodOverloadArea  extends StaticMethods{
	public double area(float r)//Static method can access by extended class too
	{
		String s2=StaticMethods.Test();
		System.out.println(s2);
		return Math.PI*r*r;
		
	}
	public double area(float b,float h)
	{
		
		return 0.5*b*h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloadArea mA=new MethodOverloadArea();
System.out.println("Area of Circle" +mA.area(7.5f));
System.out.println("Area of Triangle"+mA.area(7,8));
	}
	
}
