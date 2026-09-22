package Assignments.Day4;

import java.util.Scanner;

public class OperationsonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int a[]=new int[sc.nextInt()];
System.out.println("enter the elements into Array");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
System.out.println("Integer Array");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
System.out.println();
//2.find maximum element in array
     int p = 0;
	for (int j = 0; j <(a.length-1); j++) {
		
			if (a[j+1]>a[j]) 
			{
				p =a[j+1];

		}
	}
	System.out.println("maximum element in array is "+p);
	//3.find unique elements in Array
	System.out.println("unique elements");
	
	for(int i=0;i<a.length;i++)
	{
int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{count++;
			
			}
			
		}
		if(count ==1)
		System.out.println(a[i]);		
}
	//print even numbers in array
	System.out.println("even numbers in given array");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
			System.out.println(a[i]);
	}
	sc.close();
	
	}
}



