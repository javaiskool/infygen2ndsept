//inheritance super to call parent class method
class Parent
{
	private int x;
	public Parent()
	{
		System.out.println("deault constructor in parent class");
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
	private int y;
	Child()
	{
		super();
		System.out.println("default constructor in child class");
		y=200; 
	}
	Child(int y)
	{	
		
		super(y);
		this.y=y;
		System.out.println("1 parameter constructor in child class");
		
	}
	Child(int x,int y)
	{
		super(x);
		System.out.println("2 parameter constructor in child class");
		this.y=y;
	}

	public void display()
	{
		System.out.println("child y = "+y);
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$\n");
	}
	public void displayXY()
	{
		super.display();
		System.out.println("child y = "+y);
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
