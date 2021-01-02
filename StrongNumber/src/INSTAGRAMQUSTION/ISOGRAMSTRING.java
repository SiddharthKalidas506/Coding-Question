package INSTAGRAMQUSTION;

import java.util.Scanner;

public class ISOGRAMSTRING {
	public static void main(String[] args) {

/*
 ISOGRAM STRING GIVEN STRING 
 STRING S= OF LOWERCASE TO CHECK STRING IN WHICH NO LETTER OCCOUR MORE 
 THAN ONE 
 EG :INPUT = MACHINE 
     OUTPUT=1
      INPUT=GEEKS
      OUTPUT=0;
 */
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String q=scn.next();
		char [] l=q.toCharArray();
		int count=1;
		for(int i=0;i<l.length;i++)
		{
			for(int j=i+1;j<l.length;j++)
			{
				if(l[i]==l[j])
				{
					count=2;
				}
			}
		}
		if(count ==1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
		
	}
}
