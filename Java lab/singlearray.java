import java.util.Scanner;

class Array1
{
	int[] res;

	int[] compute(int[] s)
	{
		res=new int[s.length];

		for(int i=0;i<s.length;++i)
		{
			res[i]=s[i]+10;
		}
		
		return res;
	}	
}


class singlearray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Array1 a1=new Array1();		

		System.out.println("Enter Size of Array");
		int n=s.nextInt();

		int[] a=new int[n];
		int[] b=new int[n];

		System.out.println("Enter "+n+" Elements");
		for(int i=0;i<n;++i)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("\n\nArray Elements");
		for(int i=0;i<n;++i)
		{
			System.out.print(a[i]+" ");
		}

		b=a1.compute(a);
		
		System.out.println("\n\nArray After Increment");
		for(int i=0;i<n;++i)
		{
			System.out.print(b[i]+" ");
		}
	}

}