package com.java.Hackathon;

public class QuickSortArray {
	public void quicksort( int array1[],int low, int high)
	{
		
		if(low<high) {
		int indexpivot=partition (array1, low, high);
		
	quicksort( array1,low,indexpivot-1);
	quicksort(array1,indexpivot+1,high);
	}}
	public int partition(int array1[],int low,int high)
	{
		int pivot=array1[low];
		int k=high;
		for(int i=high;i>0;i--)
		{
			if(array1[i]>pivot)
			{
				int p=0;
			
			p=array1[k];array1[k]=array1[i];array1[i]=p;
			k--;
		}}
	 int m=0;
	m=array1[k];array1[k]=array1[low];
	array1[low]=m;
	return k;
	}
 public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] array1= {7,6,10,5,9,2,1,15,7};
	int low=0;
	int hight=array1.length-1;
	
	QuickSortArray qc=new QuickSortArray();
	qc.quicksort(array1, low, hight);
	System.out.println("sorted elements in Array");
	for(int a:array1)
	{
		System.out.println(a);
	}
 }}

