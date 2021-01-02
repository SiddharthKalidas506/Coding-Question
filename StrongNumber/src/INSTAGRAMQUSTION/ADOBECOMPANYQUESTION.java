package INSTAGRAMQUSTION;

import java.util.Scanner;

public class ADOBECOMPANYQUESTION {
	public static void main(String[] args) {
/*
 GIVE AN ARRAY OF INTEGERS FIND THE COUNTING PAIRS OF ELEMENTS IN ARRAY 
 WHOSE SUM IS EQUAL TO THE INPUT VALUE 
 
 EG:-6====1,5 5,1
 */
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value to be get paired");
		int n=scn.nextInt();
		int a [] = {1,5,7,1};
		String u="";
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					u=u+a[i]+",";
					u=u+a[j]+"   ";
				}
			}
		}
		System.out.println(u);
	}

}
