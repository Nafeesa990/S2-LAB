class input{
public static void main(String a[]){
String name=a[0];
int value=Integer.parseInt(a[1]);
int mark=Integer.parseInt(a[2]);
System.out.println("Your name is="+a[0]);
System.out.println("Your value is="+a[1]);
System.out.println("Your mark="+a[2]);
show();

input i=new input();
i.shown();

System.out.println("Your increased mark is ="+i.marks(mark));
}


static void show(){
System.out.println("Inside static method");
}
void shown(){
System.out.println("Inside object method");
}
int marks(int mark){
mark=mark+10;
return mark;
}

}