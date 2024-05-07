import java.util.Scanner;
class B
{
 
 static int rollno;
 static String name;
 static int mark;
 static count;
 void display()   //non static
  {
System.out.println("name is " +name);
    System.out.println("rollno is " +rollno);
    System.out.println("mark is " +mark);
}
 static void show() //static method
{ 
  Scanner s = new Scanner(System.in); 
  B a = new B();
  System.out.println("enter your name");
  a.name= s.nextLine();
  System.out.println("enter your rollno");
  a.rollno=s.nextInt();
  System.out.println("enter your mark");
  a.mark = s.nextInt();
}
public static void main(String args[]) //main method itself static
{
// Scanner s = new Scanner(System.in);
 B a = new B();
  show();
  a.display();
}
}
