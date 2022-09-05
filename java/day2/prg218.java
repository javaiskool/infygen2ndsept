// for loop
import java.util.*;
class Demo
{
	public static void main(String [] args)
	{
		String sport;
		int cc=0,fc=0,nc=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the sport");
			sport=sc.next();
			switch (sport)
			{
				case "CRICKET":
				case "cricket":cc=cc+1;
						break;
				case "FOOTBALL":
				case "football":fc=fc+1;
						break;
				default:nc=nc+1;
			}
		}
		System.out.println("cricket : "+cc);
		System.out.println("football : "+fc);
		System.out.println("invalid : "+nc);
	}
}
