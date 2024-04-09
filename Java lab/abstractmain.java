//abstract

abstract class A{
    
    void displayA()
    {
      System.out.println("Inside abstract class");
    } 
    
    abstract void displayB();

}

class B extends A{
     void check(){
            System.out.println("Inside check method");
     }
     void displayB(){
       System.out.println("Inside displayB");
     }
 
}

class abstractmain{
  public static void main(String args[]){
    
   B b=new B();
   A a=new B();//reference variable
   a.displayA();
   b.check();
   b.displayB();

   }

}