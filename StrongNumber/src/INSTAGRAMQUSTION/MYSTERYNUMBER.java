package INSTAGRAMQUSTION;

import java.util.Scanner;

public class MYSTERYNUMBER {
	public static void main(String[] args) {
/*
  MYSTERY NUMBER ARE THOSE NUMBER FROM 10 TO 100 THAT NUMBER SHOULD BE 
  REVERSED AND THEN ADDED SO IT SHOULD MATCH WITH THE INPUT NUMBER
  EG:-121
  29 IS THE FIRST NUMBER WHEN IT IS REVERSED AND THEN ADDED IT MATCHES 
  WITH THE INPUT NUMBER 
  29+92=121
 */
		Scanner scm=new Scanner(System.in);
		System.out.println("enter the Mystery number");
		int a=scm.nextInt();
		int j=100;
		int q=0;
		int s=0;
		int ss=0;
		for(int i=10;i<j;i++)
		{
			int u=i;
			s=0;
			ss=0;
			q=0;
			s=s+i;
			ss=ss+i;
			while(u>0)
			{
				int l=u%10;
			    q=(q*10)+l;
				u=u/10;
			}
			int o=s+q;
			if(o==a)
			{
				j=ss;
				System.out.println(s+" "+q);
				System.out.println("it is a mystery number");
			}}}}

