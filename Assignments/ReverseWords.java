package Assignments;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter no of words in the sentence");
int n=sc.nextInt();
sc.nextLine();
	String st[]=new String[n];
	System.out.println(n+"enter words");
	for(int i=0;i<n;i++)
	{
		st[i]=sc.nextLine();
		
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(st[i]); 
	}
	
	String s1;
	for(int j=0;j<n;j++)
	{
		s1=st[j];
	char a[]=new char[s1.length()];
	for(int i=1;i<=a.length;i++)
	{
		a[i-1]=s1.charAt((a.length)-i);
		 System.out.print(a[i-1]+" ");
		
	}
	System.out.println();
	
	
	}

}
}
