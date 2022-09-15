package pkg1;
class B
{
	public void displayB()
	{
		A a1=new A();
		System.out.println("display method in B");
		//System.out.println("pv = "+a1.pv);//can use getter & setter to access
		System.out.println("pk = "+a1.pk);
		System.out.println("pt = "+a1.pt);
		System.out.println("pb = "+a1.pb);
	}
}