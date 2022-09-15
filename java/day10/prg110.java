// exception handling
import java.io.*;

class Tester
{
	public void method1() throws IOException
	{
		String str="1A234";
		int x=Integer.parseInt(str);
		System.out.println(str+" "+x);
	}
	
	public static void main(String[] s)// throws IOException
	{
		int a,b,c=0;
		a=6;
		b=3;
		try
		{
		System.out.println("starting of try block");
		System.out.println(a/b);
		int[] ar={6,2,0,8};
		for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);
		System.out.println("end of try block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("some arithmetic problem occured"+"\n"+"you tried to divide by 0");

		}
		System.out.println("continue after  try-catch");
			
		
		Tester t=new Tester();
		try{
		t.method1();}
		catch(Exception e){System.out.println(e);}
			
		System.out.println(t);
		System.out.println(c);
		System.out.println("end of program");
	}
}
