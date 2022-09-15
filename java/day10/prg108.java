// exception handling
import java.io.*;

class Tester
{

	public void method1()  
	{
		int min=1,max=200;
			int sum=0;
		 
		 for(int i=min;i<max;i++)
		{
			sum=sum+i;
			System.out.println("sum = "+sum);
			if(sum>300) 
			{
		throw new IOException();
			}
			System.out.println("*******");

		}
	}
	public static void main(String[] s) throws IOException
	{ 
		 Tester t1=new Tester();
			
		try{
			t1.method1();
			}
		 
		catch(IOException ae)
		{
			System.out.println("some arithmetic problem occured"+ae);
		}
		finally
		{
			System.out.println("always executed");
		}
		
		System.out.println("continue after  try-catch");
			
		String str="1234";
		int x=Integer.parseInt(str);
		System.out.println(str+" "+x);
		Tester t=null;
		System.out.println(t);
		//System.out.println(c);
		System.out.println("end of program");
	}
}
