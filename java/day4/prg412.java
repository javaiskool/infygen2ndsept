//array as instance variable
class Emp
{
	private int empNo;//instance variable
	private String empName;//instance variable
	private float salary;//instance variable
	private long[] contacts;
	public Emp(int empNo,String empName,float salary,long[] contacts)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		this.contacts=contacts;
	}
	public void setEmpNo(int empNo){this.empNo=empNo;}
	public int getEmpNo(){return empNo;}
	public void setContacts(long[] contacts) {this.contacts=contacts;}
	public long[] getContacts(){return contacts;}
	public void setEmpName(String empName){this.empName=empName;}
	public String getEmpName(){return empName;}
	public void setSalary(float salary){this.salary=salary;}
	public float getSalary(){return salary;}
	
	public void displayEmpInfo()//method  
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name   : "+empName);
		System.out.println("Salary          : "+salary);
		for(long c:contacts)
		System.out.print(c+" ");
		System.out.println("\n************************\n");
	}
}
class Demo
{
	public static void main(String [] args)
	{
		long[] l1={12334,87878,65765};
		Emp e1=new Emp(11,"Pankaj",78000.0f,l1);
		e1.displayEmpInfo();
		long[] l2={576768,323232};
		Emp e2=new Emp(12,"Sudha",62000.0f,l2);
		e2.displayEmpInfo();
		 
			
	}
}

		
