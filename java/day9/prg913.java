interface inf1
{
	int x=100;
	public void display();
	public int sqrX();
}
interface inf2
{
	public void displayMsg();
}

class Demo implements inf1,inf2
{
	int y;
	public void display(){System.out.println("Demo class");}
	public int sqrX(){return (x*x);}
	public void displayMsg(){System.out.println("Good day!");}
}
class Tester
{
	public static void main(String s[])
	{
		Demo d1=new Demo();
		d1.display();
		d1.displayMsg();
	}
}