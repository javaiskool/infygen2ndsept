//multile constructors
class Emp
{
	public int empNo;//instance variable
	public String empName;//instance variable
	public float salary;//instance variable

	public Emp(int empNo,String empName,float salary)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
	}
	public Emp(int empNo)
	{
		this.empNo=empNo;
		this.salary=20000.0f;
	}
	public Emp()
	{
		this.empNo=-1;
		this.salary=0.0f;
		this.empName="AAA";
	}

	public void displayEmpInfo()//method  
	{
		System.out.println("Employee Number : "+this.empNo);
		System.out.println("Employee Name   : "+this.empName);
		System.out.println("Salary          : "+this.salary);
	}
	 

}
class Demo
{
	public static void main(String [] args)
	{
		Emp e1=new Emp(11,"Pankaj",45000.0f);
		e1.displayEmpInfo();
		Emp e2=new Emp(12);
		e2.displayEmpInfo();
		Emp e3=new Emp();
		e3.displayEmpInfo();	
	}
}

		
