//constructor
class Emp
{
	public int empNo;//instance variable
	public String empName;//instance variable
	public float salary;//instance variable

	public Emp()
	{
		System.out.println("in the constructor");
		empNo=11;
		empName="Harry";
		salary=70000.0f;
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
		Emp e1=new Emp();
		e1.displayEmpInfo();
		Emp e2=new Emp();
		e2.displayEmpInfo();
			
	}
}

		
