package INSTAGRAMQUSTION;
import java.util.Scanner;
public class hackerrankproblems {
public static void main(String[] args) {
/*
 GIVEN ARRAY OF N INTEGER AND NUMBER D 
 PROGRAM TO PERFORM LEFT ROTATION ON ARRAY 
 ARRAY SHIFTS EACH OF THE ARRAY ELEMENT D UNITS TO LEFT
 EG; N=6,D=2 ARR=3,4,5,6,7,8
     OUTPUT=5,6,7,8,3,4
 */
	Scanner scn=new Scanner(System.in);
	System.out.println("ENTER THE SIZE FOR ARRAY");
	int n=scn.nextInt();
	Scanner j=new Scanner(System.in);
	System.out.println("NUMBER TO PERFORM LEFT ROATION");
	int d=j.nextInt();
	//int []arr=new int[n];
	String oo="";
	for(int i=0;i<n;i++)
	{
		Scanner m=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER IN THE ARRAY");
		int b=m.nextInt();
		//arr[i]=b;
		oo=oo+b;
	}
	String mm="";
	String kk="";
	char[] vc=oo.toCharArray();
	for(int i=0;i<oo.length();i++)
	{
		if(i>=d)
		{
			mm=mm+vc[i];
		}
		else
		{
			kk=kk+vc[i];
		}
	}
	String bv=mm+kk;
	System.out.println(bv);
	//int []sm=new int[n-d];
	//int hh[]=new int[d-1];
	//for(int i=0;i<arr.length;i++)
	//{
		//for(int jl=0;jl<arr.length;jl++)
		//{
			
		//}
	//}
}}
/*
 doubt to ask
 how to initialize array object into another array object 
 like arr=[1.2.3.4.5]
 int jj=new int[4];
 INT KKK=NEW INT[5];
 char[] vc=oo.toCharArray();
for(int i=0;i<oo.length();i++)
	{
		if(i>=d)
		{
		JJ
			mm=mm+vc[i];
		}
		else
		{
			kk=kk+vc[i];
		}
	}
	
also need to ask how to add two array 
 * */