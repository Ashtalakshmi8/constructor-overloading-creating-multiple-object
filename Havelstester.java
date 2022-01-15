class Havelstester{
	public static void main (String[]args){
		Havels h= new Havels();
		System.out.println ("colour:"+h.colour+"\tbrand:"+h.brand+"\tdiscount:"+h.discount+"\tspeed:"+h.speed+"\tprice:"+h.price);
		System.out.println();
		
		h.colour="white";
		h.brand="usha";
		h.discount=75;
		h.speed=1200f;
		h.price=2500;
		
		System.out.println ("colour:"+h.colour+"\tbrand:"+h.brand+"\tdiscount:"+h.discount+"\tspeed:"+h.speed+"\tprice:"+h.price);
		System.out.println();
		
		Havels hh=new Havels("black","Havells",10,1200f);
		
		System.out.println ("colour:"+hh.colour+"\tbrand:"+hh.brand+"\tdiscount:"+hh.discount+"\tspeed:"+hh.speed);
		System.out.println();
		
		
		Havels hhh=new Havels("superfan",4300f,73);
		
		System.out.println ("brand:"+hhh.brand+"\tspeed:"+hhh.speed+"\tdiscount:"+hhh.discount);
		System.out.println();
		
		
		hhh.price=2398;
		hhh.discount=75;
		hhh.colour="green";
		hhh.brand="bajaj";
		
		
		System.out.println ("price:"+hhh.price+"\tdiscount:"+hhh.discount+"\tcolour:"+hhh.colour+"\tbrand:"+hhh.brand);
		System.out.println();
		
		
		Havels haa=new Havels("yellow","orbit",89);
		
		System.out.println ("colour:"+haa.colour+"\tbrand:"+haa.brand+"\tdiscount:"+haa.discount);
		System.out.println();
		
		
		
		Havels hu=new Havels("orange","good",1200f,7332);
		
		System.out.println ("colour:"+hu.colour+"\tbrand:"+hu.brand+"\tspeed:"+hu.speed+"\tprice:"+hu.price);
		System.out.println();
		
		hu.colour="cream";
		hu.brand="bajaj";
		hu.speed=1500;
		
		System.out.println ("colour:"+hu.colour+"\tbrand:"+hu.brand+"\tspeed:"+hu.speed);
		System.out.println();
		
	}
	
	
	
	
	
}