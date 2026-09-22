package com.java.Hackathon;

import java.util.Scanner;

public class SumOfConsecutiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a number to calculate sum of consecutive integers");
				int n=sc.nextInt();
				int s;
				for(int i=1;i<n;i++)
				{s=0;
					for(int num=i;num<n;num++)
					{
						s=s+num;
						if(s==n)
						{
							for(int k=i;k<=num;k++)
							{
								System.out.print(k+" ");
						}
							System.out.println();
		                    break;
		                }

		                if (s > n) {
		                    break;
		                }
		            }
					}
				
				sc.close();
			}
				
			}

	


