// unary operators 
class Demo
{
	public static void main(String[] args)
	{
		int x=20, y=6;
		System.out.println(x);  
		System.out.println(y);  
		 
		System.out.println(++x);//output 21 value of x =21
		System.out.println(y++);// output 6 value of y =7

		x=y++; // postfix increment value will be used first then it is incremented 
		System.out.println(x); //7 
		System.out.println(y); //8
		x=++y; // prefix increment value will be incremented first then it is used
		System.out.println(x); //9
		System.out.println(y); //9
	}
}