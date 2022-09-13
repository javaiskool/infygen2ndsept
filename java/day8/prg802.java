// method overloading 
class Demo
{
	private String msg;
	public Demo(String msg)
	{this.msg=msg;}
	public String getMsg(){return msg;}
	public void setMsg(String msg){this.msg=msg;}
	void displayMsg()
	{
		System.out.println("Welcome to JAVA");
	}
	//int displayMsg()//error : method overloading is not recognized with difference in returntype
	//void displayMsg() //error : method already defined
	//void displayMsg(boolean bl) // not a good practice
	void displayMessage()
	{
		System.out.println(msg);
	}
	void displayMsg(String name)
	{
		System.out.println("Hello "+name);
	}
	void displayMsg(int time)
	{
		if(time<12)
		System.out.println("Good morning");
		else
		System.out.println("Good day");
	}
	void displayMsg(int time,String name)
	{
		System.out.println("name "+name);
		System.out.println("time "+time);
	}
	void displayMsg(String name,int time)
	{
		System.out.println( name+" is an employee");
		System.out.println( time+" in-time ");
	}
	/*void displayMsg(String s,int t)//error : already defined 
	{
		System.out.println( "aaaaa");
		
	}*/
}
class Tester
{
	public static void main(String s[])
	{
		Demo d1=new Demo("Happy Learning");
		d1.displayMsg();
		//d1.displayMsg(true);
		d1.displayMessage();
		d1.displayMsg("Harry");
		d1.displayMsg(10);
	}
}

	