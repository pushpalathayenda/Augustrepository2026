package Assignments.Day1;

import java.util.Scanner;

public class Factorial {
		//Recursive method
		public static int fact(int value)
		{
			if(value==1)
				return 1;
			else 
				 return value*fact(value-1);
			
		}

	public static void main(String[] args) {

				System.out.println("enter a number to find out  factorial of it");
				Scanner sc=new Scanner(System.in);
				Factorial f=new Factorial();
				int i=sc.nextInt();
				int k=1;
				//Iterative method
				for(int j=i;j>=1;j--)
				{
					k=k*j;	
				}
					System.out.println("factiroal  of  " +i+" is ="+k);
				System.out.println("Factorial of "+i+" is= "+fact(i));	
				sc.close();
			}
			

		

	}


