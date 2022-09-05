// if     else if
import java.util.*;
class Demo
{
	public static void main(String [] args)
	{
		int x,y;
		int ch=1;
		Scanner sc=new Scanner(System.in);
		while(ch==1)
		{
			System.out.println("enter a number");
			x=sc.nextInt();
			System.out.println("enter a number");
			y=sc.nextInt();
			System.out.println(x+" + "+y+" = "+(x+y));
			System.out.println(x+" - "+y+" = "+(x-y));
			System.out.println(x+" * "+y+" = "+(x*y));
			System.out.println(x+" / "+y+" = "+(x/y));
			System.out.println("continue?(1-yes):");
			ch=sc.nextInt();
		}

	}
}
