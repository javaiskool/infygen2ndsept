//single inheritance
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
	public int getEmpNo(){return empNo;}
	public void setEmpNo(int empNo){this.empNo=empNo;}
	public void setEmpName(String empName){this.empName=empName;}
	public String getEmpName(){return empName;}
	public float getSalary(){return salary;}
	public void setSalary(float salary){this.salary=salary;}

	public void displayEmpInfo()//method  
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name   : "+empName);
		System.out.println("Salary          : "+salary);
	}
	 

}
class Programmer extends Emp
{
	private String skill;
	public Programmer(int empNo,String empName,float salary,String skill)
	{
		super(empNo, empName, salary);
		this.skill=skill;
	}
	public String getSkill(){return skill;}
	public void setSkill(String skill){this.skill=skill;}
	public void displayEmpInfo()
	{
		super.displayEmpInfo();
		System.out.println("Skill : "+skill);
		System.out.println("\n");
	}
}
		
class Demo
{
	public static void main(String [] args)
	{
		Programmer p1=new Programmer(11,"Pankaj",45000.0f,"JAVA");
		p1.displayEmpInfo();
		Programmer p2=new Programmer(12,"Sudha",62000.0f,"ORACLE");
		p2.displayEmpInfo();
			
	}
}

		
