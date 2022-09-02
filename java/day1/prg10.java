// logical operators
class Demo
{
	public static void main(String[] args)
	{
		int x=20, y=6;
		System.out.println(x>y && x>18); // true && true => true
		System.out.println(x==20 || x<y); // true || false => true
		System.out.println(!(10<y)); // false   !false => true
		int min;
		min=(x>y)?y:x;
		System.out.println(min); 


	}
}