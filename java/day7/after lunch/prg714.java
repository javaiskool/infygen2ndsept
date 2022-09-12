//multilevel inheritance (Emp - Programmer-TeamHead)
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
class TeamHead extends Programmer
{ 
	private String project;
	private int teamSize;
	public TeamHead(int empNo,String empName,float salary,String skill,String project,int teamSize)
	{
		super(empNo, empName, salary,skill);
		this.project=project;
		this.teamSize=teamSize;
	}
	public String getProject(){return project;}
	public void setProject(String project){this.project=project;}
	public int getTeamSize(){return teamSize;}
	public void setTeamSize(int teamSize){this.teamSize=teamSize;}
	public void displayEmpInfo()
	{
		super.displayEmpInfo();
		System.out.println("Project "+project);
		System.out.println("TeamSize "+teamSize);
		System.out.println("\n");
	}
}
		
class Demo
{
	public static void main(String [] args)
	{
		TeamHead t1 =new TeamHead(11,"Pankaj",45000.0f,"JAVA","Project1",10);
		t1.displayEmpInfo();
		 			
	}
}

		
