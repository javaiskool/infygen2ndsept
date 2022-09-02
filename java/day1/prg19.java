//   conversion demo
class Welcome
{
	public static void main(String args[])
	{
		short s=30000,t;
		int x=20000,y;
		y=s;//inplicit smaller to bigger
		System.out.println(y);
		t=(short)x; //explicit bigger to smaller without loss of data
		System.out.println(t); 
		x=200000;
		t=(short)x; //explicit bigger to smaller with loss of data
		System.out.println(t); 
		 
	}
}

