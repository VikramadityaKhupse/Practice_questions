class College{

	static int collegeID = 30;

	{
		System.out.println("Inside college class init block");
	}

	static{

		System.out.println("College static");
	}
	College(){

		System.out.println("College constructor");
	}
}

class SGGS extends College{

	static int x = 45;
	static College sggs = new College();
	int y = 2024;

	{
		System.out.println("SGGS init");


	}

	SGGS(){

		System.out.println("SGGS constructor");
	}

	public static void main(String[] args) {
		System.out.println("MAIN");
		SGGS sggs1 = new SGGS();
		System.out.println("SGGS1");
		

	}
	static{

		System.out.println("SGGS static");
	}
}