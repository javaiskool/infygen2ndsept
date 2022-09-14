//object class toString methods 
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
	public String toString()
	{
		return itemName;
	}
	 
	
}
class Tester
{
	public static void main(String[] args)
	{
		Item i1=new Item(1,"orange","Fruit");
		Item i2=new Item(2,"Apple","Fruit");
		Item i3=new Item(3,"Orange","Fruit");
		Item i4=new Item(4,"Apple","Gadget");
		
		System.out.println(i1.getItemName());
		System.out.println(i3);
		
	}
}