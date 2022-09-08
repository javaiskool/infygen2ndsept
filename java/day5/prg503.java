//string literal 
class Demo
{
	public static void main(String [] args)
	{
		// string literal
		String msg="Welcome";
		String s1="hello";
		String s2="Welcome";
		System.out.println(msg==s1);
		System.out.println(msg==s2);
		System.out.println(msg.equals(s1));
		System.out.println(msg.equals(s2));
	}
}