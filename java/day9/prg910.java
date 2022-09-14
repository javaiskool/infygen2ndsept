//abstract class without abstract method 
abstract class Parent
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
		System.out.println("hello class");
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
}
class Tester
{
	public static void main(String[]s)
	{
		Child c1=new Child(10);
		c1.displayA(); 
		c1.displayB(); 
		c1.displayMsg(); 
		//Parent p1=new Parent();//error
		 
	}
}


