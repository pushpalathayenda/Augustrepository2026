package Assignments.Day2;

import java.util.Scanner;

public class MethodOverloading {
	public void largeNumber(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
			System.out.println(a+" is a biggestest of all 3 numbers");
			if(b>c)
			{
				System.out.println(b+" is a second  biggestest of all 3 numbers");
		System.out.println(c+" is a smallest number");
			}
			else
			{
				System.out.println(c+" is a second  biggestest of all 3 numbers");
				System.out.println(b+" is a smallest number");
			}
		}
		
			else
			{
				
				if(b>c&&b>a)
				{
					System.out.println(b+" is a biggestest of all 3 numbers");
					if(c>a)
					{
						System.out.println(c+" is a second  biggestest of all 3 numbers");
				System.out.println(a+" is a smallest number");
					}
					else
					{
						System.out.println(a+" is a second  biggestest of all 3 numbers");
						System.out.println(c+" is a smallest number");
					}
					
				}
				if(c>a&&c>b)
				{
					System.out.println(c+" is a biggestest of all 3 numbers");
					if(a>b)
					{
						System.out.println(a+" is a second  biggestest of all 3 numbers");
				System.out.println(b+" is a smallest number");
					}
					else
					{
						System.out.println(b+" is a second  biggestest of all 3 numbers");
						System.out.println(a+" is a smallest number");
					}
					
				}
				
				
		
		}
		
	}
	
	public void largeNumber(int a,int b )
	{
		if(a>b)
		{
			System.out.println(a+" is a largest of these 2 numbers ");
		}
		System.out.println(b+ "is largest among 2 numbers");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter 3 numbers");
					int a=sc.nextInt();	
					int b=sc.nextInt();
					int c=sc.nextInt();
					
					 MethodOverloading ln=new  MethodOverloading();
					ln.largeNumber(a,b,c);
					System.out.println("which is biggest of "+b+" & "+c);
					ln.largeNumber(b, c);
					sc.close();
					

			}

		

	


	}


