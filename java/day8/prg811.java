// instanceOf operator returns true or false after checking if a partucular object belongs to particular class 

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
	public void displayMsg()
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
	public void displayMsg()
	{
		System.out.println("Welcome Child class");
	}
	public void displayAB()
	{
		displayA();
		displayB();
	}
}
class Tester
{
	public static void main(String[]s)
	{
		System.out.println("case 1 : object and reference of child class");
		Child c1=new Child(200);
		System.out.println("c1 instance of parent "+(c1 instanceof Parent));
		System.out.println("c1 instance of child "+(c1 instanceof Child));
		System.out.println("c1 instance of object "+(c1 instanceof Object));

		//case 2
	System.out.println("\n\ncase 2 : object and reference of parent class");
		Parent p1=new Parent();
		System.out.println("p1 instance of parent "+(p1 instanceof Parent));
		System.out.println("p1 instance of child "+(p1 instanceof Child));
		System.out.println("p1 instance of object "+(p1 instanceof Object));

//case 3
		System.out.println("\n\ncase 3 : object of child class and reference of parent class");
		Parent pc=new Child(5000);
		System.out.println("pc instance of parent "+(pc instanceof Parent));
		System.out.println("pc instance of child "+(pc instanceof Child));
		System.out.println("pc instance of object "+(pc instanceof Object));

	}
}


