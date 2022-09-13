// different type of child classes

class Parent
{
	void display()
	{System.out.println(" @@  display in parent class @@");}
	void displayp()
	{System.out.println(" !! displayp in parent class  !!");}
}

class Child1 extends Parent // display method of parent not overridden
{
	void displayc()
	{System.out.println(" displayc in child1 class");}
}

class Child2 extends Parent //overriding & providing additional implementation to display method of parent
{
	void displayc()
	{System.out.println(" displayc in child2 class");}
	void display()
	{
		super.display();
		System.out.println(" ## overriden display in child class  ##");
	}
}
class Child3 extends Parent //overriding & providing new/different implementation to display method of parent
{
	void displayc()
	{System.out.println(" displayc in child3 class");}
	void display()
	{
		 System.out.println(" *** overriden display in child class ***");
	}
}
class Tester
{
	public static void main(String []s)
	{
		Child3 c1=new Child3();
		c1.display();
		c1.displayp();
		c1.displayc();
		 
	}
}