class Practice{


public static void main(String [] args){
	
	try{
	System.out.println(args[0]);
	}
	catch(Throwable e){
		System.out.println("Inside catch");
	
	
	}catch(Exception e){
		System.out.println("Inside Throwable catch");
	
	
	}finally{
	
	System.out.println("Inside Finally");
	
	}

}
}


