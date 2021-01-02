package INSTAGRAMQUSTION;

import java.util.Scanner;

public class nagarrocompany {
public static void main(String[] args) {
	int m[] = {1,2,3,4,-5,-6,-7};
	String h="";
	String w="";
	String q="";
	for(int i=0;i<m.length;i++)
	{
		int c=m[i];
		if(c>=-100&&c<=-1)
		{
			h=h+c+" ";
		}
		else if(c>=1&&c<=100)
		{
			w=w+c+" ";
		}
	}
	q=h+w;
	System.out.println(q);
}
}
