import java.util.*;
 class Hello
 {
	  static void ex1()
	  {
		  try
		  {
				System.out.println("ex1");
				throw new RuntimeException();
		  }
		  finally
		  {
			  System.out.println("ex1 finally");
		  }
	  }

	  static void ex2()
	  {
		  try
		  {
			  System.out.println("ex2");
			  throw new RuntimeException();
		  }
		  catch(RuntimeException e)
		  {
			  System.out.println("exception ex2= "+e);
		  }
		  finally
		  {
			  System.out.println("ex2 finally");
		  }
		  
	  }

	  static void ex3()
	  {
		  try
		  {
			  System.out.println("ex3");
		  }
		  finally
		  {
			  System.out.println("ex3 finally");
		  }
	  }

	  public static void main(String args[])
		{
			try
			{
				ex3();
				ex2();
				ex1();
			}
			catch(Exception e)
			{
				System.out.println("exception caught in main");
			}

	    }
	}