// do while & break  
import java.util.*;
class Demo
{
	public static void main(String [] args)
	{
		int pwd;
		int ch=1;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("enter the password");
			pwd=sc.nextInt();
			if(pwd==123)
			{
				System.out.println("password is correct");
				break;
			}	
			ch=ch+1;
		}
		while(ch<=3);
		System.out.println("execution after loop");
	}
}
