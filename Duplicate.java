import  java.util.*;
class nandha 
{
	 int a[]=new int[10];
	int n,dup;
		Scanner s=new  Scanner(System.in);	
	
	void Duplicate()
	{
	  System.out.println("No. of array:");
		dup=s.nextInt();	
		
	}
	
	void getdata()
	{
	System.out.println("size for array:");
		n=s.nextInt();	
	
		for(int i=0;i<n;i++)
		{	System.out.println("enter input for array:");
			a[i]=s.nextInt();
		}
	}
	
	void putdata()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
		
				if(a[i]==a[j])
				System.out.println("the duplicate number is "+a[j]);
			
			}
		
		}
	
	}
	
	}
	
 class Duplicate
{
	public static void main(String args[])
	{
		nandha d = new nandha();
		d.getdata();
		d.putdata();
	}
}