//inheritance super keyword to access member variable of super class
class Parent
{
	private int x;
	public Parent()
	{
		System.out.println("default constructor in parent class");
		x=1; 
	}
	public Parent(int x)
	{
		System.out.println("1 parameter constructor in parent class");
		this.x=x; 
	}
	public int getX(){return x;}
	public void setX(int x){this.x=x;}

	public void display()
	{
		System.out.println("value of x in parent class = "+x);
		 
		System.out.println("\n !!!!!!!!!!!!!!!!!!! \n");
	}
	static 
	{
		System.out.println("static block in parent class");
	}
		
}
class  Child extends Parent
{
	private int x;
	Child()
	{
		super();
		System.out.println("default constructor in child class");
		x=200; 
	}
	Child(int x)
	{	
		
		super(x);
		this.x=x;
		System.out.println("1 parameter constructor in child class");
		
	}
	Child(int x,int y)
	{
		super(x);
		System.out.println("2 parameter constructor in child class");
		this.x=y;
	}
	public int getX(){return x;}
	public void setX(int x){this.x=x;}

	public void display()
	{
		System.out.println("child x = "+x);
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$\n");
	}
	public void displayXY()
	{
		 
		System.out.println("value of x in paret class = "+super.getX());
		System.out.println("value of x in child class = "+x);
		System.out.println("\n********************\n");
	}
	static 
	{
		System.out.println("static block in child class");
	}
}
class Demo
{
	static 
	{
		System.out.println("static block in demo class");
	}
	public static void main(String [] args)
	{
		Child c1=new Child();
		c1.display();
		c1.displayXY();
		
	}
}
