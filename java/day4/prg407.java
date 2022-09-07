//indirect access using encapsulation
class Emp
{
	private int empNo;//instance variable
	private String empName;//instance variable
	private float salary;//instance variable

	public Emp(int empNo,String empName,float salary)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
	}
	public void setEmpNo(int empNo){this.empNo=empNo;}
	public int getEmpNo(){return empNo;}
	public void setEmpName(String empName){this.empName=empName;}
	public String getEmpName(){return empName;}
	public void setSalary(float salary)
	{
		if(salary>=this.salary)
		{this.salary=salary;}
	}
	public float getSalary(){return salary;}
	
	public void displayEmpInfo()//method  
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name   : "+empName);
		System.out.println("Salary          : "+salary);
		System.out.println("************************\n");
	}
	public Emp compareSalary(Emp e)
	{
		if(this.salary>e.salary)
			return this;
		else
			return e;
	}
	 

}
class Demo
{
	public static void main(String [] args)
	{
		Emp e1=new Emp(11,"Pankaj",78000.0f);
		e1.displayEmpInfo();
		Emp e2=new Emp(12,"Sudha",62000.0f);
		e2.displayEmpInfo();
		Emp es;	
		es=e1.compareSalary(e2);
		es.displayEmpInfo();
			
	}
}

		
