import java.util.*;

public class prime
{
	public static void main(String args[])
	{
		int st,en;
		Scanner s = new Scanner(System.in);
		System.out.println("enter starting number");
		st=s.nextInt();
		System.out.println("enter ending number");
		en=s.nextInt();
		for(int i=st;i<=en;i++)
		{
			if((i%3)==0)
			{
				System.out.println(i+"  is divisible by 3");
			}
		
        if((i%5)==0)
			{
				System.out.println(i+"  is divisible by 5");
			}
		
		}
	}
	
}