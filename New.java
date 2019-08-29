import java.util.Scanner; 
public class New
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,i,sum=0;
		System.out.println("enter a number");
		n = s.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.println("enter a number");
			int x = s.nextInt();
			sum = sum + x;
		}
	System.out.println("sum is = "+sum);
	}
}