//inheritance parent class used through object of child class
class Parent
{
	private int pv;
	protected int pt;
	int pk;
	public int pb;

	public Parent()
	{
		System.out.println("constructor in parent class");
		pv=1;pt=2;pk=3;pb=4;
	}

	public int getPV(){return pv;}
	public void display_Parent()
	{
		System.out.println("\ndisplay in parent class");
		System.out.println("parent pv = "+pv);
		System.out.println("parent pt = "+pt);
		System.out.println("parent pk = "+pk);
		System.out.println("parent pb = "+pb);
		System.out.println("\n !!!!!!!!!!!!!!!!!!! \n");
	}
}
class  Child extends Parent
{
	public void display_Child()
	{
		System.out.println("\ndisplay in child class");
		System.out.println("child pv = "+getPV());
		System.out.println("child pt = "+pt);
		System.out.println("child pk = "+pk);
		System.out.println("child pb = "+pb);
		System.out.println("\n********************\n");
	}
}
class Demo
{
	public static void main(String [] args)
	{
		Child c1=new Child();
		c1.display_Parent();
		c1.display_Child();

	}
}
