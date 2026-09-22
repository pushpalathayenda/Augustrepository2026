package Assignments.Day4;

import java.util.Scanner;

public class EvenNumbersAtFrist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8.move all the evene numbers to the beggining of the array
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

		int k=0;
		
		for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {   // even number found
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
                k++;
            }
        }

        System.out.println("All even numbers at beginning of array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}