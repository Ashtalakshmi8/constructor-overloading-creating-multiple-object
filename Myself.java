/*   constructror overloading*/

class Myself{
	String eye;
	int trusting;
	String colour;
	int curious;
	char sensitive;
	Myself()// constructror//
	{
	System.out.println("Ashu flying in air");
	}  //null//
	//1st parameter//
	Myself (String eyeo,int trustingo,String colouro,int curiouso,char sensitiveo ){
	  eye=eyeo;
	  trusting=trustingo;
	  colour=colouro;
	  curious=curiouso;
	  sensitive=sensitiveo;
	}
	//2nd parameter//
    Myself (String eyeoo,int trustingoo,int curiousoo,char sensitiveoo ){
	eye=eyeoo;
	trusting=trustingoo;
	curious=curiousoo;
	sensitive=sensitiveoo;	
	
	}
		
		Myself (String eyeof,int trustingof,String colourof,int curiousof){
			
	  eye=eyeof;
	  trusting=trustingof;
	  colour=colourof;
	  curious=curiousof;
		}
		
		Myself (String eyeoff,String colouroff,int curiousoff,char sensitiveoff,int trustingoff ){
	  eye=eyeoff;
	  colour=colouroff;
	  curious=curiousoff;
	  sensitive=sensitiveoff;
	   trusting=trustingoff;
	}
	
		
		Myself (String eyeof,String colourof,int curiousof){
			
	  eye=eyeof;
	  
	  colour=colourof;
	  curious=curiousof;
	
    }

   Myself (int trustingog,String colourog,int curiousog,char sensitiveog ){
	  
	  trusting=trustingog;
	  colour=colourog;
	  curious=curiousog;
	  sensitive=sensitiveog;



}
     Myself (String colourofff,int curiousofff,int trustingofff ){
		 
	  
	  colour=colourofff;
	  curious=curiousofff;
	   trusting=trustingofff;

}
}
	
