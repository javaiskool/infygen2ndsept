//switch case 
class Demo
{
	public static void main(String [] args)
	{
		char ch='c';
		System.out.println("before condition");
		switch (ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("character is a vowel");
				break;
			default :
				System.out.println("character is not a vowel");
		} 
		System.out.println("after condition");
	}
}
