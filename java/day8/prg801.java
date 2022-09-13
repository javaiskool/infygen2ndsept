// need of method overloading 
class Demo
{
	private String msg;
	public Demo(String msg)
	{this.msg=msg;}
	public String getMsg(){return msg;}
	public void setMsg(String msg){this.msg=msg;}
	void displayMsgConst()
	{
		System.out.println("Welcome to JAVA");
	}
	void displayMsgVar()
	{
		System.out.println(msg);
	}
	void displayMsgWithName(String name)
	{
		System.out.println("Hello "+name);
	}
	void displayMsgWithTime(int time)
	{
		if(time<12)
		System.out.println("Good morning");
		else
		System.out.println("Good day");
	}
}
class Tester
{
	public static void main(String s[])
	{
		Demo d1=new Demo("Happy Learning");
		d1.displayMsgConst();
		d1.displayMsgVar();
		d1.displayMsgWithName("Harry");
		d1.displayMsgWithTime(10);
	}
}

	