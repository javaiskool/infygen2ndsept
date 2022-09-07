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
	}
	 

}
class Demo
{
	public static void main(String [] args)
	{
		Emp e1=new Emp(11,"Pankaj",45000.0f);
		//System.out.println(e1.empNo);//direct access
		System.out.println(e1.getEmpNo());//indirect access
		//e1.salary=20000;//data is set without validation due to direct access
		e1.setSalary(25000);
		e1.displayEmpInfo();
		Emp e2=new Emp(12,"Sudha",62000.0f);
		e2.displayEmpInfo();
			
	}
}

		
