//with parameter without return
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
	public void updateSalary(int amt)//method definition
	{
		salary=salary+amt;
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
			
		System.out.println("salary : "+e1.salary);
		e1.updateSalary(5000); //method call
		System.out.println("updated salary : "+ e1.salary);
		
		
		 
		
	}
}

		
