//inheritance default constructor of parent and default/parameterised coonstructor of child 
class Parent
{
	private int x;
	public Parent()
	{
		System.out.println("default constructor in parent class");
		x=1; 
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
		System.out.println("default constructor in child class");
		y=200; 
	}
	Child(int y)
	{
		System.out.println("1 parameter constructor in child class");
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

	}
}
