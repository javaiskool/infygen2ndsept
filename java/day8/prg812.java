//overriding concept applies to methods only
class Parent
{
	int x;
	Parent(){this.x=10;}
	void displayX()
	{System.out.println("x in parent class"+x);}
	int getX(){return x;}
}
class Child extends Parent
{
	int x;
	Child(){this.x=20;}
	void displayX()
	{System.out.println("x in child class"+x);}
	int getX(){return x;}
}
class Tester
{
	public static void main(String []s)
	{
		//Parent p1=new Parent();
		//Child p1=new Child();
		Parent p1=new Child();
		p1.displayX();
		System.out.println(p1.getX());
		System.out.println(p1.x);
	}
}