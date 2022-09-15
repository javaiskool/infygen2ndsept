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
		System.out.println("starting of try block");
		System.out.println(a/b);
		int[] ar={6,2,0,8};
		for(int i=0;i<=ar.length;i++)
		System.out.println(ar[i]);
		System.out.println("end of try block");
		
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("some arithmetic problem occured"+"\n"+"you tried to divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("trying to access array beyond limit");	
		}
		
		System.out.println("continue after  try-catch 1");
		try
		{	
		String str="1A234";
		int x=Integer.parseInt(str);
		System.out.println(str+" "+x);
		}
		catch(Exception e)
		{
			System.out.println("some problem occured"+e);
		}
		System.out.println("continue after  try-catch 2");
		Tester t=null;
		System.out.println(t);
		System.out.println(c);
		System.out.println("end of program");
	}
}
