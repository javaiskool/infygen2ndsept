//switch case with user input (Scanner class)
import java.util.*;

class Demo
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=5,b=3,op;
		System.out.println("enter a number");
		a=sc.nextInt();
		System.out.println("enter a number");
		b=sc.nextInt();
		System.out.println("select operation (1/2/3/4): ");
		op=sc.nextInt();
		System.out.println("before condition");
		switch (op)
		{
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println("a-b = "+(a-b));
				break;
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
