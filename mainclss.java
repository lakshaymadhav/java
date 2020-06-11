import java.util.*;

class Person
{
    
    String name,addr,phno,email;
    Scanner s=new Scanner(System.in);
    
    void details()
    {  
        System.out.println("enter your details:");
        System.out.println("Name: ");
        name=s.next();
        System.out.println("Address:  ");
        addr=s.next();
        System.out.println("Phone no: ");
        phno=s.next();
        if(phno.length()!=10)
        {
            throw new RuntimeException();
        }
        System.out.println("Email id: ");
        email=s.next();   
    }
    void problem()
    {
        String prob;
        System.out.println("description about the problem");
        prob=s.next();
        System.out.println("your request has been recorded successfully");
        System.out.println("servicemen will contact you within a day ");   
    }
}

class Problem extends Person
{
    Scanner s=new Scanner(System.in);
    int c;
    
    void problem()
    {
        System.out.println("choose your required servicemen");
        System.out.println("1.Electrician");
        System.out.println("2.Plumber");
        System.out.println("3.Carpenter"); 
        System.out.println("4.Technician(TV & AC)");
        System.out.println("enter your choice");
        c=s.nextInt();
            switch(c)
            {
                case 1:
                {   
                    int ap1;
                    System.out.println("enter the appliance to be serviced");
                    System.out.println("1.tubelight and fan");
                    System.out.println("2.main board");
                    System.out.println("3.wiring");
                    System.out.println("enter your choice");
                    ap1=s.nextInt();
                    super.problem();
                    break;
                }

                case 2:
                {   
                    int ap1;
                    System.out.println("enter the problem to be addressed");
                    System.out.println("1.clogging");
                    System.out.println("2.leaking");
                    System.out.println("3.installing pipes");
                    System.out.println("enter your choice");
                    ap1=s.nextInt();
                    super.problem();
                    break;
                }

                 case 3:
                {   
                    int ap1;
                    System.out.println("enter the woodwork to be done");
                    System.out.println("1.furniture");
                    System.out.println("2.doors & windows");
                    System.out.println("3.cupboards");
                    System.out.println("enter your choice");
                    ap1=s.nextInt();
                    super.problem();
                    break;
                }
                 case 4:
                {   
                    int ap1;
                    System.out.println("enter the appliance to be serviced");
                    System.out.println("1.TV");
                    System.out.println("2.AC");
                    System.out.println("3.Fridge");
                    System.out.println("4.Inverter");
                    System.out.println("enter your choice");
                    ap1=s.nextInt();
                    super.problem();
                    break;

                }

                default:
                {
                    System.out.println("sorry, invalid choice");
                }          
 
            }

    }
}

class mainclss
{
    public static void main(String args[]) 
    {
        System.out.println("WELCOME TO HOME UTILITY SERVICES");    
        Problem p=new Problem();
        try 
        {
        p.details();
        p.problem();
        System.out.println("for any queries, reach us on 1800-500-303");
            
        } 
        catch (RuntimeException e) 
        {
            System.out.println("phone number must be 10 digits");
            
        }   
    }
}