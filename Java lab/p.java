class complex{
   double r; 
   double im;
 
   complex(double a,double b){
     r=a;
     im=b; 
 }
}

class p{
  public static void main(String a[]){
    complex c1=new complex(1.0,2.3);
    complex c2=new complex(1.2,0.2);

    p p1=new p();
    p1.add(c1,c2);     
}

 void add(complex n1,complex n2){
   double c=n1.r+n2.r;
   double d=n1.im+n2.im;

   System.out.println("Sum="+c+"+"+d+"i");
}
}