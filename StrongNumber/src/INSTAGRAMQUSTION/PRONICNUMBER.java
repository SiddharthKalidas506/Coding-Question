package INSTAGRAMQUSTION;

import java.util.Scanner;
public class PRONICNUMBER {
public static void main(String[] args) {
/*
 * Pronic number is a number which is the product of two 
 * consecutive integers, that is, a number n is a product 
 * of x and (x+1). 
  EG-N=6
     J=2*3=6
     N==J
 */
	Scanner sn=new Scanner(System.in);
	System.out.println("ENTER PRONI NUMBER");
	int h=sn.nextInt();
	boolean a=true;
	for(int i=0;i<100;i++)
	{
		int j=i*(i+1);
		if(h==j)
		{
			a=false;
		}
	}
	String f=a==false?"ITS PRONIC NUMBER":"ITS NOT PRONIC NUMBER";
	System.out.println(f);
	
}
}

