class SGGS{

String name = "Vikramaditya";
int age = 19;

SGGS(){

	this(19);
	System.out.println("This is SGGS default constructor");

}
SGGS(int x){

	
	this(20, "Pandu");
	System.out.println("This is param constructor "+x);

}

SGGS(String x){


	System.out.println("This is param string constructor "+ x);

}

SGGS(int x, String y){

	this("Pandu");
	System.out.println("This is double param string constructor "+ x + y);

}

public static void main(String[] args){

	SGGS sggs1 = new SGGS();

}

}
