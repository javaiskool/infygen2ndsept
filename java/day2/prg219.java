// continue  and break statement

import java.util.*;
class Demo
{
	public static void main(String [] args)
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{
			if(i%3==0) continue;
										System.out.println(i);
			sum=sum+i;
			if(sum>100)break;
			
		}
		System.out.println("sum = "+sum);
	}
		
}
