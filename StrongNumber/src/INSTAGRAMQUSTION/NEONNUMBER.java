package INSTAGRAMQUSTION;

import java.util.Scanner;

public class NEONNUMBER {
public static void main(String[] args) {

/*
 NEON NUMBER IS A NUMBER WHERE THE 
 SQUARE OF THE NUMBER AND THEN ADD THE VALUES 
 MATCH THE RESULT WITH INPUT
 EG:  N=9
      F=9*9=81;
      THEN GG=(8+1)=9
      THEFORE N==GG TRUE
 */
	Scanner scn=new Scanner(System.in);
	System.out.println("ENTER NUMBER TO CHECK NEON NUMBER");
	int ee=scn.nextInt();
	int f=ee*ee;
	int n=0;
	while(f>0)
	{
		int q=f%10;
		n=n+q;
		f=f/10;
	}
	if(n==ee)
	{
		System.out.println("ITS IS A NEON NUMBER");
	}
	else
	{
		System.out.println("ITS IS NOT A NEON NUMBER");
	}
}
}