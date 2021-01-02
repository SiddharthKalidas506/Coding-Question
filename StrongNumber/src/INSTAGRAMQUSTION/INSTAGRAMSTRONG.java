package INSTAGRAMQUSTION;

import java.util.Scanner;

public class INSTAGRAMSTRONG {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("ENTER A NUMBER");
	int h=scn.nextInt();
	int q=h;
	int sum=0;
	while(q>0)
	{
		int j=q%10;
		int b=1;
		while(j>0)
		{
			b=b*j;
			j--;
		}
		sum=sum+b;
		q=q/10;
	}
	String n=sum==h? "ITS A STRONG NUMBER" :"ITS NOT A STRONG NUMBER";
	System.out.println(n);
}}