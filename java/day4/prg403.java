// memory management garbage collection case 3
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
		System.out.println("\n**************\n");
	}
	public void method1()
	{
		//this.display();
		Emp e=new Emp(8,"WWW");
		e.display();
	}
	public void method2(Emp e2)
	{
		//this.display();
		e2.eno=200;
		e2.display();
	}
}
class Tester
{
	public static void main(String args[])
	{
		Emp e1=new Emp(1,"AAA");
		Emp e2=new Emp(2,"BBB");
		e1.display();
		e2.display();
		e1.method1();
		e1.method2(e2);
		e1.method2(new Emp(4,"HHH"));
		e1.display();
		e2.display();
		System.out.println("program continues");
		

	}
}



	
		