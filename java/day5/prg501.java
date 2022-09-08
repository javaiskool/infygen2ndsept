//double dim array
class Demo
{
	public static void main(String []args)
	{
		int ar[][]={{1,4,8},{4,6,9,100},{9000}}; 

		for(int r=0;r<ar.length;r++)
		{
			for(int c=0;c<ar[r].length;c++)
				System.out.println(ar[r][c]);
			System.out.println("\n");
		}
		for(int row[]:ar)
		{
			for(int col:row)
				System.out.print(col+" ");
			System.out.println("\n");
		}
				
	}
}