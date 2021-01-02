package INSTAGRAMQUSTION;

import java.util.Scanner;

public class UGLYNUMBER {
public static void main(String[] args) {
/*
 UGLY NUMBER ARE THOSE NUMBER WHICH ARE PRIME FACTOR 2,3,5 AND IT 
 SHOULD NOT GET DIVIDED BY 7
 EG:-60 DIVIDED BY 2,3,5
 EG;-420 GET DIVIDED BY 2,3,5, ALSO 7 SO IT IS WRONG 
 EG:-10 GET DIVIDED BY 2,5 SO IT AS UGLY NUMBER
 */
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the number");
	int f=scn.nextInt();
	int l=f;
	int o=0,q=0,a=0,e=0;
	    if(l%2==0) 
	    {
			o=1;
		}
		if(l%3==0)
		{
			q=1;
		}
		if(l%5==0)
		{
			a=1;
		}
		if(l%7==0)
		{
			e=1;
		}
		int j=o+q+a-e;
		int qj=o+q+a+e;
		if(j==3){
			System.out.println("it is ugly number");
		} else if (j<2||j>3){
	    	System.out.println("it is not an ugly number");
	    } else if(qj==4){
	    	System.out.println("it is not an ugly number");
	    } else{
	    	System.out.println("it is ugly number");
	    }}}

