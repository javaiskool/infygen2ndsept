//association with array of objects
class Car
{
	private int cid;
	private String model;
	public Car(int cid,String model)
	{
		this.cid=cid;
		this.model=model;
	}
	public void setCid(int cid){this.cid=cid;}
	public int getCid(){return cid;}
	public void setModel(String model){this.model=model;}
	public String getModel(){return model;}
	public void assignDriver(Driver d)
	{
		System.out.println("CAR "+this.model);
		System.out.println("Driver Name "+d.getDname());
	}
}
class Driver
{
	private int did;
	private String dname;
	public Driver(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public void setDid(int did){this.did=did;}
	public int getDid(){return did;}
	public void setDname(String dname){this.dname=dname;}
	public String getDname(){return dname;}
}

class Tester
{
	public static void main(String args[])
	{
		Driver d[]={new Driver(101,"AAA"),new Driver(102,"BBB")};
		 
		Car c[]={new Car(1,"M1"),new Car(2,"M2"),new Car(3,"M3")};
		/*int n;
		if(d.length==c.length){n=d.length;}
		else if (d.length<c.length){n=d.length;}
		else {n=c.length;}*/

		for(int i=0;i<d.length&&i<c.length;i++)
		c[i].assignDriver(d[i]);
	}
}


	