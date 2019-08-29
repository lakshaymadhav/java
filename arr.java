import java.util.*;
public class arr
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		Scanner s = new Scanner(System.in);
		int n,k;
		System.out.println("enter n");
		n = s.nextInt();
		System.out.println("enter array elements");
		for(int i = 0;i<n;i++)
		a[i] = s.nextInt();
		int search;
		System.out.println("enter search no");
		search = s.nextInt();
		for(int i= 0;i<n; i++)
		{
			if(a[i] == search )
			{
				for(int j=i;j<n-1;j++)
				{
					a[j]=a[j+1];
				}
			}
		}
	System.out.println("the final array is");
		for(int  i = 0;i<n-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}