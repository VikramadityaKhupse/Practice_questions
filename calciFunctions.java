public class CalciFunctions{

public static void main(String [] args){
	
	

	System.out.println("\n"+tan(45));
	System.out.println("\n"+cot(45));
	

}
//Functions for addition

public static float add(float num1, float num2){

	return num1 + num2;

}

//Functions for subtraction

public static float sub(float num1, float num2){

	return num1 - num2;

}
//Function for multiplication
public static float mul(float num1, float num2){

	return num1 * num2;

}

//Function for dividing
public static float div(float num1, float num2){

	return num1 / num2;

}

//Function for finding power
public static float pow(float base, float power){

    float result = 1f;

    while (power != 0) {
      result *= base;
      --power;
    }
    return result;
    
    

}
//Function for finding square root value
public static float sqrt(float num1){
	
	float i = 0;
	for(; i < num1/2;i++){
		if(i*i == num1){
		
		break;
		}
		
	}
	return i;

}

//Function for finding factorial of a number
public static float fact(float num1){
	if(num1 == 1){
	return num1;
}

return num1*fact(num1-1);
	

}

//Function for finding sin value of a number
public static float sin(float num1){
	
	
	num1 = (float) Math.toRadians(num1);
	return (float) Math.sin(num1);
	
}

//Function for finding cos value of a number
public static float cos(float num1){
	
	
	num1 = (float) Math.toRadians(num1);
	return (float) Math.cos(num1);
	
}

//Function for finding tan value of a number
public static float tan(float num1){
	
	
	
	return sin(num1)/cos(num1);
	
}
//Function for finding cot value of a number
public static float cot(float num1){
	
	
	
	return 1/tan(num1);
	
}
}

