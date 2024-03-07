import java.util.Scanner;

class Product
{
   int pcode;
   String pname;
   int price;
   
  int get(){ 
   Scanner s=new Scanner(System.in);
   System.out.println("Enter Product code");
   pcode=s.nextInt();
   s.nextLine();
   System.out.println("Enter Product name");
   pname=s.nextLine();
   System.out.println("Enter Price");
   price=s.nextInt();

   return price;

   }

  void display(){
   System.out.println("----------------------display--------------------------");
   System.out.println("Product code="+pcode);
   System.out.println("Product Name="+pname);
   System.out.println("Price="+price);
  }




class two_class{
  public static void main(String args[]){
       Product p1=new Product();
       Product p2=new Product();
       Product p3=new Product();
    
 int price1=p1.get();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
 int price2=p2.get();
    
 int price3=p3.get();

  p1.display();
  p2.display();
  p3.display();

 System.out.println("----------------------lowest_price--------------------------");

 if(price1<price2){
    if(price1<price3){

  System.out.println("less:price1= "+price1);
}
else{
System.out.println("less:price3="+price3);
}
}
else if(price2<price3){
System.out.println("less:price2="+price2);
}
else{
System.out.println("less:price3="+price3);
}

      
}
}