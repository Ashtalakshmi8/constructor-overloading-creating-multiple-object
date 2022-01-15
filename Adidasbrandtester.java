	class Adidasbrandtester{
 public static void main(String []args){
     
	 
  Adidasbrand addd=new Adidasbrand();
		System.out.println("Type:"+addd.type+"\tprice:"+addd.price+"\tQuality:"+addd.Quality+"\tlightweight:"+addd.lightweight+"\tsize:"+addd.size);
	           System.out.println();	
			   
    addd.type="hoodies";
    addd.price=4000;
    addd.Quality=8;
    addd.lightweight=174.2f;
    addd.size='s';
	System.out.println("Type:"+addd.type+"\tprice:"+addd.price+"\tQuality:"+addd.Quality+"\tlightweight:"+addd.lightweight+"\tsize:"+addd.size);	 
          System.out.println();	  
	  
	Adidasbrand ad=new Adidasbrand(433,'7',"ball");
	   System.out.println("Type:"+ad.type+"\tprice:"+ad.price+"\tQuality:"+ad.Quality+"\tlightweight:"+ad.lightweight+"\tsize:"+ad.size);
           System.out.println();
		   
		 Adidasbrand adidas=new Adidasbrand("leggings",18.974f,'1',75);
	 System.out.println(""+adidas.type+"\t"+adidas.lightweight+""+adidas.size+""+adidas.Quality);
	 System.out.println();   
		    
		adidas.type="bat";
        adidas.price=80000;
		adidas.size='l';
		adidas.Quality=9;
		adidas.lightweight=2.2f;
		
		System.out.println("Type:"+adidas.type+"\tprice:"+adidas.price+"\tQuality:"+adidas.Quality+"\tsize:"+adidas.size+"\tlightweight:"+adidas.lightweight);
		System.out.println();
		
	Adidasbrand adi=new Adidasbrand(4,4000,2008f,"Shoes",'x');
		System.out.println("Quality:" +adi.Quality+ "\tprice:" +adi.price+"\tlightweight:"+adi.lightweight+"\ttype:"+adi.type+"\tsize:"+adi.size);
		System.out.println();
		
	Adidasbrand adl=new Adidasbrand("gloves",4000,'l');
     System.out.println("Type:" +adl.type+ "\tprice:" +adl.price +"\tsize:"+adl.size);
	      System.out.println();	
	  adl.type="perfumes";
	  adl.price=2000;
	  adl.Quality=9;
	  System.out.println("Type:" +adl.type+ "\tprice:" +adl.price+"\tQuality:"+adl.Quality+"\tsize:"+adl.size);
	      System.out.println();	
	  
	}
}	  
	 