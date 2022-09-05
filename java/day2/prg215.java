// if     else if
class Demo
{
	public static void main(String [] args)
	{
		char ch='#';
		System.out.println(ch+"\t"+(int)ch);
		if(ch>=65 && ch<=90)
			System.out.println("capital letter");
		else if(ch>=97 && ch<=122)
			System.out.println("small letter");
		else if(ch>=48 && ch<=57)
			System.out.println("digit");
		else
			System.out.println("special character");

	}
}
