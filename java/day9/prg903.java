//object class hashCode() method
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
	public int hashCode()
	{
		int r=1;
		r=r+(itemName.hashCode());
		return r;
	}
		
	
}
class Tester
{
	public static void main(String[] args)
	{
		Item i1=new Item(1,"Orange","Fruit");
		Item i2=new Item(2,"Apple","Fruit");
		Item i3=new Item(3,"Orange","Fruit");
		Item i4=new Item(4,"Apple","Gadget");
		Item i5=i4;
		System.out.println(i4.hashCode());
		System.out.println(i5.hashCode());
		System.out.println(i2.hashCode());
		
		
	}
}