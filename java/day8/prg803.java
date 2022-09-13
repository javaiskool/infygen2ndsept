//constructor overloading

class Demo
{
	private int x;
	private float f;
	private String s;
	public Demo()
	{
		this.x=1;
		this.f=10000.00f;
		this.s="AAA";
	}
	public Demo(int x, float f,String s)
	{
		this.x=x;
		this.f=f;
		this.s=s;
	}
	public Demo(int x){this.x=x;}
	public Demo(float f){this.f=f;}
	public Demo(String s){this.s=s;}
	
	public void displayAll()
	{
		System.out.println("x = "+x);
		System.out.println("f= "+f);
		System.out.println("s = "+s);
		System.out.println("****************\n");
	}
}
class Tester
{
	public static void main(String []s)
	{
		Demo d1=new Demo();
		Demo d2=new Demo(22,54000.00f,"BBB");
		Demo d3=new Demo(99);
		Demo d4=new Demo(5500.00f);
		Demo d5=new Demo("CCC");
		d1.displayAll();
		d4.displayAll();
		d3.displayAll();
		d5.displayAll();
		d2.displayAll();
	}
}

		

	