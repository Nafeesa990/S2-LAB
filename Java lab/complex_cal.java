class complex{
  double real;
  double imag;

 complex(double a,double b){
   real=a;
   imag=b;
 }

}

class complex_cal
{
public static void main(String a[])
{

   complex c1=new complex(1.2,3.4);
   complex c2=new complex(1.1,2.1);
   

   add(c1,c2);
  
}

public static void add(complex n1,complex n2)
{
  complex re=new complex(0.0,0.0);
  re.real=n1.real+n2.real;
  re.imag=n1.imag+n2.imag;

  System.out.println("sum="+re.real+"+"+re.imag+"i");
}

}