//without parameter with return
class Emp
{
	public int empNo;//instance variable
	public String empName;//instance variable
	public float salary;//instance variable

	public void displayEmpInfo()//method // without return without parameter 
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name   : "+empName);
		System.out.println("Salary          : "+salary);
	}
	public int updateSalary()//method definition
	{
		if((salary+10000)<=50000)
		{salary=salary+10000;
		return 1;}
		else
		return 0;
	}

}
class Demo
{
	public static void main(String [] args)
	{
		Emp e1=new Emp();
		e1.empNo=101;
		e1.empName="Sagar";
		e1.salary=36000.0f;
		int status;	
		System.out.println("salary : "+e1.salary);
		status=e1.updateSalary(); //method call
		if (status==1)
		{
			System.out.println("salary updation status : successful");
		System.out.println("updated salary : "+ e1.salary);
		}
		
		 
		
	}
}

		
