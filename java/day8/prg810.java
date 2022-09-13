//if returntype is not compatible then compilation error occurs

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
	//public int displayMsg() //error return type not compatible
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
		System.out.println("case 3 : object of child and reference of parent class");
		Parent c1=new Child(200);
		c1.displayA();//method of Parent
		//c1.displayB();//method of Child
		//c1.displayAB();//method of child
		c1.displayMsg();
	}
}


