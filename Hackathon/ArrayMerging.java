package com.java.Hackathon;

public class ArrayMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array1[]=new int[10];
array1[0]=1;
array1[1]=2;
array1[2]=4;
array1[3]=6;
array1[4]=9;
array1[5]=10;
int array2[]= {3,5,7,8};
int n1 = 6; // number of filled elements in array1

for(int x : array2) {

    // find correct position for x
    int pos = 0;
    while(pos < n1 && array1[pos] < x) {
        pos++;
    }

    // shift elements to the right
    for(int i = n1; i > pos; i--) {
        array1[i] = array1[i-1];
    }

    // insert x
    array1[pos] = x;

    n1++; // array1 has one more element now
}
System.out.println("merged Array::");
for(int i=0;i<array1.length;i++) {
	
	System.out.print(array1[i]+" ");
}

	}

}
