//final class
final class Parent
{
	private int a;
	public Parent(){this.a=100;}
	public Parent(int a){this.a=a;}
	public void setA(int a){this.a=a;}
	public int getA(){return a;}
	
	public void displayA()
	{
		System.out.println("a = "+a);
	}
	public void displayMsg()
	{
		System.out.println("hello Parent class");
	}
}
/*class Child extends Parent
{
	private int b;
	public Child(int b){this.b=b;}
	public void setB(int b){this.b=b;}
	public int getB(){return b;}
	
	public void displayB()
	{
		System.out.println("B = "+b);
	}
	public void displayMesg()
	{
		System.out.println("Welcome Child class");
	}
}*/
class Tester
{
	public static void main(String[]s)
	{
		 
		/*Child c1=new Child(200);
		
		c1.displayA();//method of Parent
		c1.displayB();//method of Child
		c1.displayMsg();// method of both parent and child 
		c1.displayMesg();*/

		Parent p1=new Parent();
		p1.displayA();
		p1.displayMsg();



	}
}


