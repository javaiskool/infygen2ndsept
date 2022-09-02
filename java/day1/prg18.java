//   conversion demo
class Welcome
{
	public static void main(String args[])
	{
		 
		int x=20000,y;
		double dl=2349.0000,dp;
		dp=x;//inplicit smaller to bigger
		System.out.println(dp);
		y=(int)dl; //explicit bigger to smaller without loss of data
		System.out.println(y); 
		dl=2349.98765;
		y=(int)dl; //explicit bigger to smaller with loss of data
		System.out.println(y); 
		 
	}
}

