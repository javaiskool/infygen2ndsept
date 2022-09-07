//double dimensional array 
import java.util.*;
class Demo
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];

		System.out.println("**********way1");
		for(int i=0;i<=4;i++)
			System.out.println(ar[i]);

		System.out.println("**********way2");
		for(int i=0;i<5;i++)
			ar[i]=i*10;
		for(int i=0;i<=4;i++)
			System.out.println(ar[i]);

		System.out.println("**********way3");
		int n;
		System.out.println("how many array values ");
		n=sc.nextInt();
		int aa[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter a number");
			aa[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
			System.out.println(aa[i]);

		System.out.println("**********way4");
		ar[0]=23;ar[1]=560;ar[2]=5;ar[3]=900;ar[4]=10000;
		for(int x:ar)//for each loop
		// for(datatype variablename:arrayname) the variable takes one by one the values from the array
/*
x	ar
23	ar[0]
560	ar[1]
5	ar[2]
900	ar[3]
10000	ar[4]
*/
			System.out.println(x);

		System.out.println("**********way5");
		int a[]={5,-300,1000,0,32222};
		System.out.println("size of array a : "+a.length);
		for(int i=0;i<a.length;i++)//array property length
			System.out.println(a[i]);

	}
}

		
