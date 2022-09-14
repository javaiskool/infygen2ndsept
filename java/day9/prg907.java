// final keyword (final instance member variable) 
// value of b cannot be changed once initialized. the initialization should be done at the time of declaration or in constructor only
class Demo
{
	private int a;
	final private int b;
	public Demo()
	{
		a=10;
		b=20;
	}
	public int getA(){return a;}
	public void setA(int a){this.a=a;}
	public int getB(){return b;}
	//public void setB(int b){this.b=b;}//error
	public void display()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
class Tester
{
	public static void main(String[] args)
	{
		Demo d1=new Demo();
		d1.display();
		d1.setA(100);
		//d1.setB(200);
		d1.display();
	}
}