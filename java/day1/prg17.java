// explicit type conversion demo
class Welcome
{
	public static void main(String args[])
	{
		char ch='A';
		byte bt=120;
		short s=30000;
		int i=200000;
		long l=7766889955L ;
		float fl=3.0f;
		double dl=9.0;
		short lv;
		lv=s;
		System.out.println(lv);
		lv=(short)i;
		System.out.println(lv);
		lv=(short)ch;
		System.out.println(lv);
		lv=bt;
		System.out.println(lv);
		lv=(short)fl;
		System.out.println(lv); 
		lv=(short)dl;
		System.out.println(lv);
		//lv=s+(short)i;
		//System.out.println(lv);
		System.out.println(s+i);
	}
}

