// nested loop

import java.util.*;
class Demo
{
	public static void main(String [] args)
	{
		 int n=1;
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=4;c++)
				System.out.print((n++)+" ");
			System.out.println("\n");	
		}
		
	}
		
}

/* dry run

r	c	o/p
1	1	1 1 1 1
	2	
	3
	4
	5
2	1	2 2 2 2
	2
	3
	4
	5
3	1	3 3 3 3
	2
	3
	4
	5
4	1	4 4 4 4 
	2
	3
	4
	5
5	1	5 5 5 5
	2
	3
	4
	5
6

*/