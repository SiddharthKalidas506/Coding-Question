package INSTAGRAMQUSTION;

import java.util.Arrays;
import java.util.Scanner;

public class INSTAGRAMQUESTION3 {
	public static void main(String[] args) {
/*
 *STEP1=THE NUMBER OF TWO STRING WHICH WE WILL BE COMPARING
 *STEP2=COMPARE TWO STRING IF BOTH ARE SAME YES OR NO
 EG N=2 THAT MEAN 2 PAIR OF STRING 
 N=1
 EG-S1-SID  S2-SID  O/P-YES
 N=2
 S1-RAHUL  S2-ROHIT  O/P-NO
 */
		Scanner snn=new Scanner(System.in);
		System.out.println("ENTER NO OF TEST CASE");
		int n=snn.nextInt();
		for(int dd=0;dd<n;dd++)
		{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER FIRST STRING");
		String m=scn.next();
		Scanner san=new Scanner(System.in);
		System.out.println("ENTER SECOND STRING");
		String q=san.next();
		char e[]=m.toCharArray();
		char  d[]=q.toCharArray();
		Arrays.sort(e);
		Arrays.sort(d);
		int v=e.length;
		int count=0;
		for(int i=0;i<e.length;i++)
		{
			for(int j=i;j<d.length;j++)
			{
				if(e[i]==d[j])
				{
					count++;
				}}}
		String h=v==count? "YES" : "NO";
		System.out.println(h);
		}
	}
}
