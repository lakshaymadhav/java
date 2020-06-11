import java.util.*;
import java.io.*;
import java.net.*;
class clientchattcp
{
    public static void main(String args[])
    {
        try
        {
            Socket s=new Socket("localhost",1234);
            DataOutputStream dis=new DataOutputStream(s.getOutputStream());
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            dis.writeUTF(str);
            dis.close();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println("exception caught");
        }
    }
}