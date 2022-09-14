//final method
class Parent
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
	final public void displayMsg()
	{
		System.out.println("hello Parent class");
	}
}
class Child extends Parent
{
	private int b;
	public Child(int b){this.b=b;}
	public void setB(int b){this.b=b;}
	public int getB(){return b;}
	
	public void displayB()
	{
		System.out.println("B = "+b);
	}
	public void displayMsg(int x)//will work
	//public void displayMsg()//error cannot override final method
	{
		System.out.println("Welcome Child class");
	}
}
class Tester
{
	public static void main(String[]s)
	{
		System.out.println("case 1 : object and reference of child class");
		Child c1=new Child();
		c1.displayA(); 
		c1.displayB(); 
		c1.displayMsg(); 
		c1.displayMsg(10);



	}
}


