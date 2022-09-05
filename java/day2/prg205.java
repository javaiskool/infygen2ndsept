//nested if 
class Demo
{
	public static void main(String [] args)
	{
		int x=14;
		System.out.println("before condition");
		if(x%3==0) 
		{//true
			if(x%2==0)
				System.out.print("number is divisible by 3 and even");//true
			else
				System.out.print("number is divisible by 3 and odd");//false
		}
		else
		{//false
			if(x%2==0)
				System.out.println("number is not divisible by 3 and even");//true
			else
				System.out.println("number is not divisible by 3 and odd");//false

		System.out.println("after condition");
	}
}
