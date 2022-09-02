//boolean data type 

class Demo
{
	public static void main(String [] args)
	{
		boolean b1;  //declaration
		b1=true; //initialization
		boolean b2=true; //declaration and initialization
		boolean b3, b4=false, b5,b7=true;
		
		System.out.println(b1);
		System.out.println(b2);
		b3=false;
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5=true);
		//System.out.println(b5); // not initialized
		// System.out.println(b6); // not declared
		System.out.println("b3"); // whatever is enclosed in quotes is displayed as it is 
		System.out.println(b1+" "+b3);
			
	}
}
