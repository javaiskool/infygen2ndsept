package pkg2;
import pkg1.*;

class E extends A
{
	public void displayE()
	{
		System.out.println("display method in E");
		//System.out.println("pv = "+pv);//can use getter & setter or access
		//System.out.println("pk = "+pk);
		System.out.println("pt = "+pt);
		System.out.println("pb = "+pb);
	}
}