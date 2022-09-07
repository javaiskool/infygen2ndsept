// object 
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
		 
		//en.display();//compilation error
		em.display();//runtime exception
		e1.display(); 

	}
}



	
		