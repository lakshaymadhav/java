class Thanos
{
   public static void main (String a[])
   {		
       int i =0;
       int num =0;
		 System.out.println("prime number less than 100 \n ");

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     	System.out.print(i+" ");
	  }	
       }	
   }
}