//numeric data type 

class Demo
{
	public static void main(String [] args)
	{
		byte bt=120;
		short sh=6000;
		int i=654765;
		long l= 9876543201l;
		float f=3.142f;
		double d=8.90;
		System.out.println(bt);
		System.out.println(sh);
		System.out.println(l);
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		System.out.println(bt+sh);
		System.out.println(bt+'a'+sh);
		System.out.println(bt+""+sh);
		System.out.println(bt+" "+sh+bt);
		System.out.println(bt+" "+(sh+bt));	
	}
}
