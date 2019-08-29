public class Example
{
	public static void main(String a[])
	 {      
	 	int i,sum=0;
	 	for (i=0;i<a.length ;i++ )
	 	 {
	 		System.out.println(a[i]);
 			int x=Integer.parseInt(a[i]);
	 		sum=sum+x;	
	 	}
		System.out.println("sum="+sum);
	}
}