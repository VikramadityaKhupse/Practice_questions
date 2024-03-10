class SGGS{

static int collegeID = 456;
{
	System.out.println("This is init block of SGGS "+this);
}

SGGS(){


	System.out.println("This is SGGS default constructor" + this);

}
static{
	System.out.println("This is SGGS static block "+collegeID);

}

}

class College extends SGGS{

static int x = 200;
static SGGS sggs = new SGGS();
int y = 100;

{
	System.out.println("This is init block of college "+this);
}
College(){


	System.out.println("This is college default constructor" + this);

}
static{
	System.out.println("This is College static block "+collegeID);

}

}

public class mid_preparation{

	public static void main(String[] args){
	College clg1 = new College();
	College clg2 = new College();
	}

}
