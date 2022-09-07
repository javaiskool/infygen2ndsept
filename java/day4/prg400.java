class Temp
{
	public int id;
	public String name;
	Temp()//1
	{this.id=1;this.name="AAA";}
	Temp(int id,String name)//2
	{this.name=name;this.id=id;}
	Temp(int n)//3
	{id=n*2;}
	Temp(String name)//4
	{this.name=name;}
	Temp(String name,int id)//5
	{this.name=name;id=id;}

}
class Tester
{
	public static void main(String s[])
	{
		Temp t1=new Temp(10,"SSS");//2
		Temp t2=new Temp();//1
		Temp t3=new Temp("MMM");//4
		Temp t4=new Temp("RRR",9);//5
		Temp t5=new Temp(100);//3
	}
}

	
