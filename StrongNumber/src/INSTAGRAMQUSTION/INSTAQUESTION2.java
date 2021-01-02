package INSTAGRAMQUSTION;
public class INSTAQUESTION2 {
public static void main(String[] args) {

	int a=5;
	int b=3;
	int n=5;
	int v[]=new int[n];
	int t=1;
	for(int i=0;i<n;i++)
	{
		v[i]=(t*b);
		t=t*2;
		//System.out.println(v[i]);
	}
	int ss=0;
	int k=0;
	String kkk="";
	for(int j=0;j<n;j++)
	{
		if(k==0)
		{
		 ss=a+v[j];
		 kkk=kkk+ss;
		}
		else 
		{
		for(int c=0;c<k;c++)
		{
		  ss=a+v[c]+v[j];
		}
		kkk=kkk+ss;
		}
		System.out.println(kkk);
		
		k=k+1;	
	}
}
}
