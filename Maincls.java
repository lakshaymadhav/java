import java.util.*;

class Rectangle
{
	float length,width;
	void setdata(float x,float y)
	{
      
      if(x<20 && x>0)
      	length=x;

      if (y<20 && y>0)
      	width=y;
	
    }

    void area()
    {
    	System.out.println("area ="+(length*width));
    }

}

class Maincls
{
	float a,b;
    System.out.println("enter the length and width of the rectangle");
    Scanner s = new Scanner(System.in);
    a=nextFloat();
    b=nextFloat();
}