//string  string object
class Demo
{
	public static void main(String [] args)
	{
		// string object
		String msg=new String("Welcome");
		String s1=new String("hello");
		String s2=new String("Welcome");
		System.out.println(msg==s1);
		System.out.println(msg==s2);
		System.out.println(msg.equals(s1));
		System.out.println(msg.equals(s2));
	}
}