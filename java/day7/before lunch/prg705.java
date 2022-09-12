//inheritance private properties accessed through getter/setter methods
class Parent
{
	private int pv;
	protected int pt;
	int pk;
	public int pb;

	public Parent()
	{pv=1;pt=2;pk=3;pb=4;}

	public int getPV(){return pv;}
	public void display_Parent()
	{
		System.out.println("\ndisplay in parent class");
		System.out.println("pv = "+pv);
		System.out.println("pt = "+pt);
		System.out.println("pk = "+pk);
		System.out.println("pb = "+pb);
	}
}
class  Child extends Parent
{
	public void display_Child()
	{
		System.out.println("\ndisplay in child class");
		System.out.println("pv = "+getPV());
		System.out.println("pt = "+pt);
		System.out.println("pk = "+pk);
		System.out.println("pb = "+pb);
	}
}
class Demo
{
	public static void main(String [] args)
	{
		Parent p1=new Parent();
		p1.display_Parent();
		Child c1=new Child();
		c1.display_Child();

	}
}
