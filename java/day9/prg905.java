//object class hashCode(),equals,== for comparison
class Item
{
	private int itemNo;
	private String itemName;
	private String category;
	
	public Item(int itemNo,String itemName,String category)
	{
		this.itemNo=itemNo;
		this.itemName=itemName;
		this.category=category;
	
	}
	public void setItemNo(int itemNo){this.itemNo=itemNo;}
	public int getItemNo(){return itemNo;}
	public void setItemName(String itemName)	{this.itemName=itemName;}
	public String getItemName(){return itemName;}
	public void setCategory(String category)	{this.category=category;}
	public String getCategory(){return category;}

	public void displayItemInfo()
	{
		System.out.println("Item Number : "+this.itemNo);
		System.out.println("Item Name : "+this.itemName);
		System.out.println("Item Category : "+this.category);
	}

	public boolean equals(Object p)
	{
		Item im=(Item) p;
		if(this.itemNo==im.itemNo)
		return true;
		else
		return false;
	}
	public int hashCode()
	{
		int r=1;
		Integer i=itemNo;
		r=r+(i.hashCode());
		return r;
	}
	public String toString()
	{
		return ""+itemNo;
	}	
	
}
class Tester
{
	public static void main(String[] args)
	{
		Item i1=new Item(1,"Orange","Fruit");
		Item i2=new Item(2,"Apple","Fruit");
		Item i3=new Item(1,"Orange","Fruit");
		Item i4=new Item(1,"Apple","Gadget");
		 
		System.out.println("comparing using hashCode  ");
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());
		System.out.println(i1.hashCode()==i2.hashCode());
		System.out.println(i1.hashCode()==i3.hashCode());
		System.out.println("comparing with equals method");
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		System.out.println("comparing with == method");
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println("\n************************\n");
		System.out.println(i1);
		System.out.println(i1.toString());
		String str="Hello";
		System.out.println(str);
		System.out.println(str.toString());
		Integer n1=new Integer(10);
		System.out.println(n1);
		System.out.println(n1.toString());
		
	}
}