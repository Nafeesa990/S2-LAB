import java.util.Scanner;
class A
{
String name; 
int rollno;
 int mark;
 static int count=0;
 void display()//it is a non static method
  { 
    System.out.println("name is" +name);
    System.out.println("rollno is " +rollno);
    System.out.println("mark is" +mark);
    System.out.println("count is" +count);
 }
 public static void main(String args[]) // main method is static
{
  Scanner s = new Scanner(System.in);
  A a = new A();
  //for(int i=0;i<10;i++)
//{
  System.out.println("enter your name");
  a.name= s.nextLine();
  System.out.println("enter your rollno");
  a.rollno= s.nextInt();
  System.out.println("enter your mark");
  a.mark = s.nextInt();
  a.count = count + 1;
  a.display();}
//}
}