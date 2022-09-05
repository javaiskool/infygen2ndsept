//multiple if
class Demo
{
	public static void main(String [] args)
	{
		int x=14;
		System.out.println("before condition");
		if(x%3==0)
			System.out.print("number is divisible by 3 ");
		else
			System.out.print("number is not divisible by 3 ");

		if(x%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");

		System.out.println("after condition");
	}
}
