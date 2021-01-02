package INSTAGRAMQUSTION;

public class hackerankquestionanotherway {
public static void main(String[] args) {
	int a[]= {3,4,5,6,7,8};
	int r=2;
	int b[]=new int[r];
	int c[]=new int [a.length-r];
	int d[]=new int[a.length];
	int e=0;
	int f=0;
	for(int i=0;i<a.length;i++)
	{
		if(i<a.length-r)
		{
			c[f]=a[i];
			f++;
		}
		else
		{
			b[e]=a[i];
			e++;
		}
	}
	e=0;f=0;
	for(int j=0;j<a.length;j++)
	{
		if(j<r)
		{
			d[j]=b[e];
			e++;
		}
		else
		{
			d[j]=c[f];
			f++;
		}
	}
	for(int k=0;k<a.length;k++)
	{
		System.out.println(d[k]);
	}
}
}
