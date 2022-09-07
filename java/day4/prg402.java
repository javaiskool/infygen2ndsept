// memory management garbage collection case 2
class Emp
{
	public int eno;
	public String enm;
	public Emp(int eno,String enm)
	{this.eno=eno;this.enm=enm;}
	public void display()
	{
		System.out.println("Employee Number : "+this.eno);
		System.out.println("Employee Name   : "+this.enm);
	}
}
class Tester
{
	public static void main(String args[])
	{
		Emp en;
		Emp em=null;
		Emp e1=new Emp(1,"AAA");
		Emp e2=new Emp(2,"BBB");
		e1.display();
		e2.display();
		e1=new Emp(3,"CCC");
		e1.display();
		e2.display();

	}
}



	
		