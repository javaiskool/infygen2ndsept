package pkg1;
public class A
{
	private int pv;
	int pk;
	protected int pt;
	public int pb;
	
	public A()
	{
		this.pv=1;
		this.pk=2;
		this.pt=3;
		this.pb=4;
	}
	public void displayA()
	{
		System.out.println("display method in A");
		System.out.println("pv = "+pv);
		System.out.println("pk = "+pk);
		System.out.println("pt = "+pt);
		System.out.println("pb = "+pb);
	}
}