class Demo
{
	public static void main(String []args)
	{
		 
		int da[][]={{4,5},{1,0,9},{200}};
		 
		for(int r=0;r<da.length;r++)
		{
			for(int c=0;c<da[r].length;c++)
				System.out.print(da[r][c]+" ");
			System.out.println("\n");
		}
	}
}

/*dry run
r	c	da[r][c]
0	0	4 5
	1
	2
1	0	1 0 9
	1
	2
	3
2	0	200
	1
3
*/
	
