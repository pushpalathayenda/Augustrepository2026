package Assignments.Day1;

import java.util.Scanner;

public class swappingOfTwoNumbers {
	//without using 3rd variable
	public void swapping(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swappin="+"\n"+"a="+a+"\n"+"b="+b);
		}
	//with using third variable
	public void swapping1(int a,int b)
	{int c=0;
		c=a;
		a=b;
		b=c;
	//	System.out.println("after swappin="+"\n"+"a="+a+"\n"+"b="+b);
	
		
	}
      public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the a and b values");
	a=sc.nextInt();
	b=sc.nextInt();
	swappingOfTwoNumbers sn=new swappingOfTwoNumbers();
	System.out.println("before swapping"+"\n"+"a="+a+"\n"+"b="+b); 
	sn.swapping(a, b);
	sn.swapping1(a,b);
	
		
	}

}
