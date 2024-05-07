import java.util.Scanner;
class details
{       String name;
        int rollno;
        int mark;
        Scanner s=new Scanner(System.in);
    public  static void getdetails()
    {
        
            
       // public void acceptvalue()
       
            System.out.println("Enter your Details");
            System.out.println("Enter roll no:");
            rollno=s.nextInt();
            name=s.nextLine();
            System.out.println("Enter name");
            name=s.nextLine();
            System.out.println("Enter mark:");
            mark=s.nextInt();
            
        

       

    }

    public void show()
    {
        System.out.println("Deatils");
        System.out.println("name:" +name);
        System.out.println("rolll no:" +rollno);
        System.out.println("mark:" +mark);
    }
}


class student
{
    public static void main(String args[])
    {
     details stu=new details();

        try
        {
            getdetails();
            stu.show();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}