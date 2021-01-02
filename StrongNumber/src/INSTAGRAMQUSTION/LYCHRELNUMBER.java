package INSTAGRAMQUSTION;

import java.util.Scanner;

public class LYCHRELNUMBER {
	public static void main(String[] args) {
		
/*CANNOT FORM PALINDROME THROUGH ITERATIVE PROCESS OF REPETEDLLY 
  REVERSING ITS DEGITS AND ADDING THE RESULTING NUMBER	
  EG:-56+65=121 SO NOT A LYCHREL
  EG:-295+592=887+788=1675....... SO NOT A LYCHREL NUMBER		
*/	
		int y=200;
		int m=0;
		int a=0;
		boolean v= true;
		Scanner j=new Scanner(System.in);
		System.out.println("enter the lychrel number");
		int k=j.nextInt();
	    int f=k;
	   	for(int i=0;i<y;i++)
		{
	   		String bm=Integer.toString(k);
	   		for (int mm=0;mm<bm.length()/2;mm++)
	   		{
	   			if(bm.charAt(mm)==bm.charAt(bm.length()-1-mm))
				{
	   				v=false;
					break;
				}
				else
				{
					v=true;
				}
				break;
	  		}
	   		if(v==true)
	   	{
			m=0;
			while(f>0)
			{
				int g=f%10;
				m=(m*10)+g;
				f=f/10;
			}
			int c=m+k;
			String jj=Integer.toString(c);
			for(int q=0;q<jj.length()/2;q++)
			{
				if(jj.charAt(q)==jj.charAt(jj.length()-1-q))
				{
					v=false;
					break;
				}
				else
				{
					v=true;
					k=a;
				}
				break;
			}
			break;
	   	}}
		if(v==true){
			System.out.println("it is an lychrel number");
		}else{
			System.out.println("it is not an lychrel number");
		}}}

