class Myselfashta{
	public static void main(String[]args){
		Myself ashta=new Myself (); // creating new object//
		System.out.println("eye:"+ashta.eye+"\ttrusting:"+ashta.trusting+"\tcolour:"+ashta.colour+"\tcurious:"+ashta.curious+"\tsensitive:"+ashta.sensitive);
		
		
		//1st parameter//
		ashta.eye="Attractive";
		ashta.trusting=77;
		ashta.colour="white";
		ashta.curious=85;
		ashta.sensitive='A';
		
		System.out.println("eye:"+ashta.eye+"\ttrusting:"+ashta.trusting+"\tcolour:"+ashta.colour+"\tcurious:"+ashta.curious+"\tsensitive:"+ashta.sensitive);
		System.out.println();
		
		//creating multiple constructor//
		
		Myself ash=new Myself("sexy",91,45,'B');
		
		System.out.println("eye:"+ash.eye+"\ttrusting:"+ash.trusting+"\tcurious:"+ash.curious+"\tsensitive:"+ash.sensitive);
		System.out.println();
		
		Myself ashu=new Myself("Bright",93,"like",99);
		
		System.out.println("eye:"+ashu.eye+"\ttrusting:"+ashu.trusting+"\tcurious:"+ashu.curious+"\tsensitive:"+ashu.sensitive);
		System.out.println();
		
		ashu.eye="love-it";
		ashu.colour="feel";
		ashu.curious=85;
		ashu.sensitive='9';
		ashu.trusting=98;
		   
		System.out.println("eye:"+ashu.eye+"\ttrusting:"+ashu.trusting+"\tcolour:"+ashu.colour+"\tcurious:"+ashu.curious+"\tsensitive:"+ashu.sensitive);
		System.out.println();
		
		Myself ashuu=new Myself("crying","hate",0);
		System.out.println("eye:"+ashuu.eye+"\ttrusting:"+ashuu.trusting+"\tcurious:"+ashuu.curious+"\tsensitive:"+ashuu.sensitive);
		System.out.println();
		
		Myself ashtu=new Myself(23,"white",93,'D');
		
		System.out.println("eye:"+ashtu.eye+"\ttrusting:"+ashtu.trusting+"\tcurious:"+ashtu.curious+"\tsensitive:"+ashtu.sensitive);
		System.out.println();
		
	
		ashtu.colour="yellow";
		ashtu.curious=12;
		ashtu.trusting=99;	   
		System.out.println("eye:"+ashtu.eye+"\ttrusting:"+ashtu.trusting+"\tcolour:"+ashtu.colour+"\tcurious:"+ashtu.curious+"\tsensitive:"+ashtu.sensitive);
		System.out.println();
		
		
	}
	
	
}