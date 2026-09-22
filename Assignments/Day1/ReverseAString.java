package Assignments.Day1;

import java.util.Scanner;

public class ReverseAString {
	public void stringReverse(String s)
	{
		char a[]=new char[s.length()];
	
			for(int i=1;i<=a.length;i++)
			{
				
				a[i-1]=s.charAt((a.length)-i);
				 System.out.print(a[i-1]+"");
				
			}
			
	}	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to reverse string  or digits");
		if(sc.hasNextInt())
		{
			System.out.println("you entered Integer");
			
		}
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		ReverseAString rs=new ReverseAString();
		rs.stringReverse(s);
		System.out.println("\n");
		StringBuffer sb=new StringBuffer(s);
	sb=	sb.reverse();
		System.out.println(sb);

	
	}

}
