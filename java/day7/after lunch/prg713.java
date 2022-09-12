//hierarchical inheritance (Emp - Programmer,Tester)
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
		//super.displayEmpInfo();
		System.out.println("Programmer Details");
		System.out.println("Employee Number : "+getEmpNo());
		System.out.println("Employee Name   : "+getEmpName());
		System.out.println("Salary          : "+getSalary());
		System.out.println("Skill : "+skill);
		System.out.println("\n");
	}
}
class Stester extends Emp
{
	private String stype;
	public Stester(int empNo,String empName,float salary,String stype)
	{
		super(empNo, empName, salary);
		this.stype=stype;
	}
	public String getStype(){return stype;}
	public void setStype(String stype){this.stype=stype;}
	public void displayEmpInfo()
	{
		//super.displayEmpInfo();
		System.out.println("Employee Category : Software Tester");
		System.out.println("Employee Number : "+getEmpNo());
		System.out.println("Employee Name   : "+getEmpName());
		System.out.println("Salary          : "+getSalary());
		System.out.println("Stype : "+stype);
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
		Stester t1=new Stester(13,"Harry",87000.00f,"Manual");
		t1.displayEmpInfo();
		Stester t2=new Stester(14,"Potter",66000.00f,"Mercury");
		t2.displayEmpInfo();


			
	}
}

		
