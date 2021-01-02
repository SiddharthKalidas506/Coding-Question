package INSTAGRAMQUSTION;

import java.util.Scanner;

public class DISARIUMNUMBER {
	public static void main(String[] args) {
/*
 *  if sum of its digits powered with their respective
 *  positions is equal to the number itself
 *  EG:-INPUT RES=135
 *            R=1*1+3*2+5*3;
 *      OUTPUT=135;
 *      SO RES==OUTPUT SAME IT IS DISARIUMNUMBER
 *      ELSE NOT DISARIUMNUMBER.
 */	
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER DISARIUM NUMBER");
		int n=scn.nextInt();
		int nn=n;
		int res=n;
		int r=0;
		int count=0;
		do
		{
			count++;
			nn=nn/10;
		}while(nn>0);
		 for(int i=count;i>0;i--)
		 {
			 int u=i;
			 int t=n%10;
			 int j=1;
			while(u>0)
			{
				j=j*t;
				u--;
			}
			r=r+j;
			n=n/10;
		 }
		 String l=r==res? res+" "+"IT IS DISARIUM NUMBER"
				 :res+" "+"IT IS NOT DISARIUM NUMBER ";
		 System.out.println(l);
		 scn.close();
	}
}
