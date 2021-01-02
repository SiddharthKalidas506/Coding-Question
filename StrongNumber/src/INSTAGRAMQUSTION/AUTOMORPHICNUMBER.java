package INSTAGRAMQUSTION;

import java.util.Scanner;

public class AUTOMORPHICNUMBER {
	public static void main(String[] args) {
/*
 NUMBER SHOULD BE SQUARE AND LAST 2 DIGIT SHOULD BE SAME ENTERED
 EG;-76=76*76=5776 SO 76==LAST 2 DIGIT OF 5776
*/	
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER A AUTOMORPHIC NUMBER");
		int l=scn.nextInt();
		int u=l*l;
		int ii=l;
		String gg="";
		gg=gg+l;
		int fz=0;
		int z=0;
		int  j=0;
		String kk="";
		int count=0;
		do
		{
			ii=ii/10;
			count++;
		}
		while(ii>0);
		if(count <2)
		{
		for(int i=0;i<1;i++)
		{
		    z=u%10;
		    u=u/10;
		}
		j=j+z;
		}
		else
		{
		for(int jj=0;jj<count;jj++)
		{
		      fz=u%10;
		      u=u/10;
		 	 kk=kk+fz;
		}
		 kk=kk;
		}
		String as="";
		if(count<2)
		{
		as=as+j;
		}
		else
		{
			as=as+kk;
		}
		char [] fff=gg.toCharArray();
		char [] nbnb=as.toCharArray();	
		System.out.println(nbnb);
		String vv="";
		for(int jjj=nbnb.length-1;jjj>=0;jjj--)
		{
			vv= vv+nbnb[jjj];
		}
		/*
		 ask why i am not able to compare string value 
		 to string vale as vv and gg both are string 
		 so i had to use parsing 
		 */
		int number1=Integer.parseInt(vv);
		int number2=Integer.parseInt(gg);
		
		if(number1==number2)
		{
			System.out.println("IS AN AUTOMORPHIC NUMBER");
		}
		else
		{
			System.out.println("IS NOT AN AUTOMORPHIC NUMBER");
		}
/*		
//ONE MORE EASY WAY TO SOLVE
		int num =76;
	    int sq_num = num*num;  

	    String str_num = Integer.toString(num);  
	    String square = Integer.toString(sq_num);  

	    if(square.endsWith(str_num))  
	        System.out.println("Automorphic Number.");
	    else
	        System.out.println("Not an Automorphic Number.");
	        }
*/		
	}
}
