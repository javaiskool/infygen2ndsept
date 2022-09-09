//static keyword
class Emp
{
	private int empNo;//instance variable
	private String empName;//instance variable
	private float salary;//instance variable
	//private static int companyId=1001;//static variabl declaration and initialization
	private stati int companyId; // static var declaration, internally initializd with default value of the datatype

	static
	{
		System.out.println("static block in Emp class");
		Emp.companyId=1002;//initialization of static var
	}
	public Emp(int empNo,String empName,float salary)
	{
		System.out.println("construtor in Emp class");
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
	}
	public void setEmpNo(int empNo){this.empNo=empNo;}
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
		System.out.println("Company ID : "+Emp.getCompanyId());
		//Emp.setCompanyId(1005);
		//System.out.println("Company ID : "+Emp.getCompanyId()); 
		Emp e1=new Emp(11,"Pankaj",45000.0f);
		Emp e2=new Emp(12,"Sudha",62000.0f);
		//e1.setCompanyId(1006); // it will work but not a good practice
		//System.out.println("Company ID : "+e1.getCompanyId());
		//System.out.println("Company ID : "+e2.getCompanyId()); 
		e1.displayEmpInfo();
		e2.displayEmpInfo(); 
	}
	static
	{System.out.println("static block in Demo class");}

}

		
