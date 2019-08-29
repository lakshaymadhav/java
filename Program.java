import java.util.*;
class find
{
    int n,max,max2,i;
	 int a[]=new int[100];
    void get()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=s.nextInt();
        
        System.out.println("enter the    elements");
        
        for(i=0;i<n;i++)
        {
           a[i]=s.nextInt();
        }
        max=a[0];
		  max2=a[0];
    }
    void search()
    {
        for( i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                 max=a[i];
					 max2=max;
               
            }
            else if(a[i]>max2)
            {
                a[i]=max2;
            }
        }
        System.out.println("the second largest element "+a[i]);
    }
}
public class Program
{
    public static void main(String a[]) 
    {
        find f=new find();
        f.get();
        f.search();
    }
} 
