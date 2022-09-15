// exception handling

class Tester
{
	public static void main(String[] s)
	{
		int a,b,c=0;
		a=6;
		b=3;
		System.out.println(a/b);
		int[] ar={6,2,0,8};
		for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);
		String str="1234";
		int x=Integer.parseInt(str);
		System.out.println(str+" "+x);
		Tester t=null;
		System.out.println(t);
		System.out.println(c);
	}
}
