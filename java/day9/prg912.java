interface inf1
{
	int x=100;
	public void display();
	public int sqrX();
}
class Demo implements inf1
{
	int y;
	public void display(){System.out.println("Demo class");}
	public int sqrX(){return (x*x);}
}
class Tester
{
	public static void main(String s[])
	{
		Demo d1=new Demo();
		d1.display();
	}
}