import java.util.Scanner;
class sort
{
String n;
String a;
void get()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
n=s.next();
}

void display(){
  System.out.println("Your string="+n);
}
}

class sortmain
{
  public static void main(String args[])
{
  sort so=new sort();
  so.get();
  so.display();
  //so.sort();
}}