package Assignments;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter how many names you want to print");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String  st[]=new String[n];
		
		
		for(int k=0;k<n;k++)
		{
			st[k]=sc.nextLine();
		
		}
		char v[]={'a','e','i','o','u'};
		for(String m:st)
		{   
			for(int i=0;i<5;i++)
			{
			if(  m.charAt(0)==v[i])
			{
				System.out.println(m);
			
				break;
			}
		
			
		}
		
		}
		sc.close();
		}
	}
	

	


