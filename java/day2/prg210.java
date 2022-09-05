//for loop
class Demo
{
	public static void main(String [] args)
	{
		// int i=1;
		//System.out.println("i before loop "+i);
		for(;;)
		{
			System.out.print(i+" ");
			System.out.println(i*i);
			i=i+1;
			if(i>10)break;
		}
		System.out.println("i after loop "+i);

	}
}


//dry run

/*
i 	output
1	1
2	2
3	3
4	4
5	5
6	6
7	7
8	8
9	9
10	10
11
*/
