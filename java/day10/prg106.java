// exception handling

class Tester
{
	public static void main(String[] s)
	{
		int a,b,c=0;
		a=6;
		b=2;
		try
		{
		System.out.println("starting of outer try block");
		System.out.println(a/b);
		int[] ar={6,2,0,8};
		for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);
			try
			{
			System.out.println("starting of inner  try block");	
			String str="1A234";
			int x=Integer.parseInt(str);
			System.out.println(str+" "+x);
			System.out.println("end of inner try");
			}
			catch(ArithmeticException e)
			{
			System.out.println("some problem occured"+e);
			}
			finally
			{
			System.out.println("innerblock finally always executed");
			}
		System.out.println("continue with outer try");

		}
		catch(ArithmeticException ae)
		{
			System.out.println("some arithmetic problem occured"+"\n"+"you tried to divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("trying to access array beyond limit");	
		}
		catch(Exception e){}
		finally
		{
			System.out.println("outer block finally always executed");
		}
		System.out.println("continue after  try-catch 2");
		Tester t=null;
		System.out.println(t);
		System.out.println(c);
		System.out.println("end of program");
	}
}
