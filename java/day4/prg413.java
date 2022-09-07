//array of objects
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
		//Emp[] e={new Emp(11,"Pankaj",45000.0f),new Emp(12,"Sudha",62000.0f)};
		Emp e1=new Emp(11,"Pankaj",45000.0f);
		Emp e2=new Emp(12,"Sudha",62000.0f);
		Emp[] e={e1,e2};
		for(Emp eo:e)
		eo.displayEmpInfo();
		
	}
}

		
