package pkg2;
import pkg1.*;
class D
{
	public void displayD()
	{
		A a1=new A();
		System.out.println("display method in D");
		//System.out.println("pv = "+a1.pv);//can use getter & setter to access
		//System.out.println("pk = "+a1.pk);
		//System.out.println("pt = "+a1.pt);
		System.out.println("pb = "+a1.pb);
	}
}