//static keyword for autogeneration if id
class Emp
{
	private int empNo;//instance variable
	private String empName;//instance variable
	private float salary;//instance variable
	private static int companyId; 
	private static int count;
	static
	{
		System.out.println("static block in Emp class");
		Emp.companyId=1001;//initialization of static var
		Emp.count=111;
	}
	public Emp(String empName,float salary)
	{
		System.out.println("construtor in Emp class");
		this.empNo=Emp.count++;
		this.empName=empName;
		this.salary=salary;
	}
	
	public int getEmpNo(){return empNo;}
	public void setEmpName(String empName){this.empName=empName;}
	public String getEmpName(){return empName;}
	public void setSalary(float salary){this.salary=salary;}
	public float getSalary(){return salary;}

	public static void setCompanyId(int companyId)
	{
		Emp.companyId=companyId;
	}
	public static int getCompanyId(){return companyId;}

	public void displayEmpInfo()//non-static method  
	{
		System.out.println("Company ID : "+Emp.companyId);
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name   : "+empName);
		System.out.println("Salary          : "+salary);
	}
}
class Demo
{
	
	public static void main(String [] args)
	{
		System.out.println("Program execution started");
		//System.out.println("Company ID : "+Emp.getCompanyId());
		Emp e3;
		//e3.getCompanyId();//compilation error
		System.out.println("step 1");
		Emp e4=null;
		e4.getCompanyId();
		//e4.displayEmpInfo();//runtime exception
		System.out.println("step 2");
		Emp e1=new Emp("Pankaj",45000.0f);
		System.out.println("step 3");
		Emp e2=new Emp("Sudha",62000.0f);
		e1.displayEmpInfo();
		e2.displayEmpInfo(); 
	}
	static
	{System.out.println("static block in Demo class");}

}

		
