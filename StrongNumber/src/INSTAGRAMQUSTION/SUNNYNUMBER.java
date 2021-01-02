package INSTAGRAMQUSTION;

import java.util.Scanner;

public class SUNNYNUMBER {
public static void main(String[] args) {
/*
* STEP 1-INPUT NUMBER 
* STEP 2-ALL NUMBER LESS THAN INPUT NUMBER 
* STEP 3-EACH NUMBER SHOULD BE DOUBLED THEN SUBSTRACT 1 ALSO
* STEP 4-THAT NUMBER SHOULD BE SAME AS INPUT NUMBER 
*        IF YES ITS SUNNY OR ITS NOT
* 
* EG- INPUT -P=3
*            Q=1,2
*            M=(2*2)-1=3
*            P==M
*/
	Scanner scn=new Scanner(System.in);
	System.out.println("ENTER SUNNY NUMBER");
	int p=scn.nextInt();
    int q=1;
    boolean b=false;
    while(q<p)
    {
    	int m=(q*q)-1;
    	if(m==p)
    	{
    		b=true;
    	}
    	q++;
    }
    String m=b==true?"IT IS SUNNY NUMBER":"IT IS NOT SUNNY NUMBER";
    System.out.println(m); 
}}