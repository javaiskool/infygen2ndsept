package pkg2;
//import pkg1.*;
class Tester
{
	public static void main(String[] args)
	{
		System.out.println("Tester class in pkg2");
		pkg1.A a1=new pkg1.A();
		a1.displayA();
		/*B b1=new B();
		b1.displayB();
		C c1=new C();
		c1.displayC();*/ //not accessible
		D d1=new D();
		d1.displayD();
		E e1=new E();
		e1.displayE();
	}
}
