//inheritance parameterised constructor of parent super keyword) 
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

	public void displayX()
	{
		System.out.println("value of x in parent class = "+x);
		 
		System.out.println("\n !!!!!!!!!!!!!!!!!!! \n");
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

	public void displayY()
	{
		System.out.println("child y = "+y);
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$\n");
	}
	public void displayXY()
	{
		//displayX();
		System.out.println("value of X in child class = "+getX());
		System.out.println("child y = "+y);
		System.out.println("\n********************\n");
	}
}
class Demo
{
	public static void main(String [] args)
	{
		Child c1=new Child();
		c1.displayXY();
		Child c2=new Child(900);
		c2.displayXY();
		Child c3=new Child(1000,2000);
		c3.displayXY();

	}
}
