class Demo
{
	public static void main(String []args)
	{
		int da[][]=new int[2][3];
		for(int r=0;r<2;r++)
		{
			for(int c=0;c<3;c++)
				System.out.println(r+" "+c+" "+da[r][c]);
			System.out.println("\n\n");
		}
		for(int r=0;r<da.length;r++)
		{
			for(int c=0;c<da[r].length;c++)
				System.out.print(da[r][c]+" ");
			System.out.println("\n\n");
		}
	}
}