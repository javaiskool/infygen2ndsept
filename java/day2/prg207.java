//switch case 
class Demo
{
	public static void main(String [] args)
	{
		int a=5,b=3,op=2;
		System.out.println("before condition");
		switch (op)
		{
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println("a-b = "+(a-b));
				break;
				//System.out.println("after break in case 2"); //compilation error
			
			case 3:
				System.out.println(a+"*"+b+" = "+(a*b));
				break;
			case 4:
				System.out.println("a/b = "+(a/b));
				break;
			default :
				System.out.println("invalid operation");
				break;
			 
			
		} 
		System.out.println("after condition");
	}
}
