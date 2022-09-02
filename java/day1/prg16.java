// implicit type conversion demo
class Welcome
{
	public static void main(String args[])
	{
		char ch='A';
		byte bt=120;
		short s=30000;
		int i=200000;
		long l=7766889955L ;
		float fl=3.142f;
		double dl=3.33333333;
		double lv;
		lv=s;
		System.out.println(lv);
		lv=i;
		System.out.println(lv);
		lv=ch;
		System.out.println(lv);
		lv=bt;
		System.out.println(lv);
		lv=fl;
		System.out.println(lv); 
		lv=dl;
		System.out.println(lv);
		lv=s+i;
		System.out.println(lv);
		System.out.println(s+i);
	}
}

