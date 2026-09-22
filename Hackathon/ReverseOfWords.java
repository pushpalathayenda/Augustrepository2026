package com.java.Hackathon;

import java.util.Scanner;

public class ReverseOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		
		String st=sc.nextLine();
			
			
			String words[]=st.split(" ");
			String rev="";
			for(int i=words.length-1;i>=0;i--)
			{
				rev=rev+words[i]+" ";
			}
		System.out.println("reverse order of words="+rev);	
		sc.close();
		}
		}
