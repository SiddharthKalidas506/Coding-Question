package INSTAGRAMQUSTION;

import java.util.Arrays;
import java.util.Scanner;

public class FASCINATINGNUMBER {
public static void main(String[] args) {
	
/*
 When a number(3 digits or more) is multiplied by 1,2 and 3
and when these number products are concatenated 
should have  all digits from 1 to 9 present exactly once
EG-g=3digits
   p=273
   k=273*1+273*2+273*3=273546819
   so here 1 to 9 is there 
 */
	
	Scanner scn=new Scanner(System.in);
	System.out.println("ENTER HOW MANY DIGITS U WANT");
	int g=scn.nextInt();
	Scanner snn=new Scanner(System.in);
	System.out.println("ENTER"+" "+g +" "+"DIGITS"+" "+"NUMBER");
	int p=snn.nextInt();
	String k="";
	for(int i=1;i<g+1;i++)
	{
		int w=i*p;
		k=k+w;
	}
	char l[]=k.toCharArray();
	Arrays.sort(l);
	int count =0;
	for(int i=0;i<l.length;i++)
	{
		for(int j=i+1;j<l.length;j++)
		{
			if(l[i]==l[j])
			{
				count++;
			}
		}
	}
	String s=count==0?"ITS A FASCINATING NUMBER":"ITS NOT A FASCINATING NUMBER ";
	System.out.println(s);	
}
}
