//agreegation gadget array

class Gadget
{
	private String gname;
	private String make;
	private float price;
	public Gadget(String gname,String make,float price)
	{
		System.out.println("construtor in Gadget class");
		this.gname=gname;
		this.make=make;
		this.price=price;
	}
	public void setGname(String gname){this.gname=gname;}
	public String getGname(){return gname;}
	public void setMake(String make){this.make=make;}
	public String getMake(){return make;}
	public float getPrice(){return price;}
	public void setPrice(float price){this.price=price;}
	
	static
	{
		System.out.println("static block in Gadget class");
		 
	}
}
	

class Emp
{
	private int empNo;//instance variable
	private String empName;//instance variable
	private float salary;//instance variable
	private static int companyId; 
	private static int count;
	private static Gadget[] gadget;

	static
	{
		System.out.println("static block in Emp class");
		Emp.companyId=1001;//initialization of static var
		Emp.count=111;
		Emp.gadget=new Gadget[]{new Gadget("Laptop","Dell",90000.00f),new Gadget("Mobile","Samsung",25000)};
	}
	public Emp(String empName,float salary)
	{
		System.out.println("construtor in Emp class");
		this.empNo=Emp.count++;
		this.empName=empName;
		this.salary=salary;
		this.gadget=gadget;
	}
	
	public int getEmpNo(){return empNo;}
	public void setEmpName(String empName){this.empName=empName;}
	public String getEmpName(){return empName;}
	public void setSalary(float salary){this.salary=salary;}
	public float getSalary(){return salary;}

	public static void setGadget(Gadget[] gadget){Emp.gadget=gadget;}
	public static Gadget[] getGadget(){return gadget;}

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
		System.out.print ("Gadget list      : \n");
		for(Gadget g:gadget)
		{System.out.print (g.getGname()+" "+g.getMake()+" "+g.getPrice());
		System.out.println("\n");}
		System.out.println("\n");
	}
}
class Demo
{
	static
	{
		System.out.println("static block in Demo class");
		 
	}
	public static void main(String [] args)
	{
		Emp e1=new Emp("Pankaj",45000.0f );
		Emp e2=new Emp("Sudha",62000.0f );
		e1.displayEmpInfo();
		e2.displayEmpInfo(); 
		//System.out.println("Employee Name : "+e1.getEmpName());
		//for(Gadget g:e1.getGadget())
		//System.out.println(g.getGname()+" "+g.getMake()+" "+g.getPrice());
	}
}

		
