package Assignments;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String s1;
//		
		int i;
		char a[]=new char[s.length()];
		for( i=1;i<=a.length;i++)
		{
			
			a[i-1]=s.charAt((a.length)-i);
			 System.out.print(a[i-1]+"");
			
		}
		
		
		

	}

}
