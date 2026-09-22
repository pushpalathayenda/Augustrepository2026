package Assignments.Day4;

import java.util.Scanner;

public class SumofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add sum of elements to element element of array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a[]=new int[sc.nextInt()];
		int count=0;
		System.out.println("enter the elements into Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Integer Array");
		for(int i=0;i<a.length;i++)
		{
			count=count+a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println("\n"+"sum of element is="+count);
		System.out.println("After adding sum to each element ");
		int i=0;
		while(i<a.length)
		{
			a[i]=a[i]+count;
			System.out.println(a[i]);
			i++;
			
		}
		sc.close();
			
	}

}
