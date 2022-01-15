class AddidasTester{
	public static void main (String[]args){
		Addidas addidas = new Addidas("Trackpant", 1449);
		System.out.println("Type :"+addidas.type +"\tprice : "+addidas.price);
	addidas.price = 1599;
		
		System.out.println("Type : "+addidas.type +"\tprice : "+addidas.price);
		Addidas adi = new Addidas ();
		System.out.println("Type : "+adi.type +"\tprice : "+adi.price);
		adi.type = "shoes";
		System.out.println("Type : "+adi.type +"\tprice :"+adi.price);
	}
}