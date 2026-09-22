package Assignments.Day1;

import java.util.Scanner;

public class PrimeNumber {

	public boolean primeNumber(int a)
	{
          
           if(a<=1)
        	   return false;
           if(a==2)
        	   return true;
           if(a%2==0)
        	   return false;
		
		for(int i=3;i*i<=a;i+=2)
		{
			if(a%i==0)
			{
				return false;
		
			}
		
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number wheather to check its a prime or not?");
		
		int a=sc.nextInt();
		PrimeNumber p=new PrimeNumber();
		if(p.primeNumber(a))
		{
			System.out.println(a+"  is a prime number");
			}
		else
			System.out.println(a+" not a prime  number");
		sc.close();
		

	}

}
