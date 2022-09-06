class Emp
{
	public int empNo;//instance variable
	public String empName;//instance variable
	public float salary;//instance variable
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
		e1.empNo=101;
		e1.empName="Sagar";
		e1.salary=76000.0f;
		e1.displayEmpInfo();
		Emp e2;
		e2=new Emp();
		e2.displayEmpInfo();
		/*Emp e3;
		e3.displayEmpInfo();*/
	}
}

		
