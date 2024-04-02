class Practice{


public static void main(String [] args){
	
	try{
	System.out.println(args[0]);
	}
	catch(Exception e){
		Throwable t = new Throwable("This is a throwable", e);
		//System.out.println(t.initCause(e));
		System.out.println("\n"+t.getCause());
		System.out.println("\n"+t.getStackTrace());
		System.out.println("\n"+t.getSuppressed());
		//e.printStackTrace();
		
		System.out.println("Exception in thread \"main\" " + t.getClass()+":"+  t.getMessage() + "\n\tat Practice.main");
		
	
	
	}

}
}


