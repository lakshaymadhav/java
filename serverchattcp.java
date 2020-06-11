import java.util.*;
import java.io.*;
import java.net.*;
class serverchattcp
{
    public static void main(String args[])
    {
        try 
        {
            ServerSocket ss=new ServerSocket(1234);
            Socket s=ss.accept();
            DataInputstream dis=new DataInputStream(s.getInputStream());
            String str=dis.readUTF();
            System.out.println(str);
            dis.close();
            s.close();
            ss.close();
        } 
        catch (Exception e) 
        {
            System.out.println("exception caught");
        }
    }
}