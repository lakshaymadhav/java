import java.util.*;
public class soe 
{
  public static void main(String a[]) {
      int i,sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter n");
      int n=s.nextInt();
      for(i=0;i<n;i++)
      {
          int x=s.nextInt();
          sum = sum+x;
      }
      System.out.println("sum ="+sum);
  }

}