//constructor
class Emp
{
	public int empNo;//instance variable
	public String empName;//instance variable
	public float salary;//instance variable

	public Emp(int eno,String ename,float sal)
	{
		System.out.println("in the constructor");
		empNo=eno;
		empName=ename;
		salary=sal;
	}

	public void displayEmpInfo()//method  
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name   : "+empName);
		System.out.println("Salary          : "+salary);
	}
	 

}
class Demo
{
	public static void main(String [] args)
	{
		Emp e1=new Emp(11,"Pankaj",45000.0f);
		e1.displayEmpInfo();
		Emp e2=new Emp(12,"Sudha",62000.0f);
		e2.displayEmpInfo();
			
	}
}

		
