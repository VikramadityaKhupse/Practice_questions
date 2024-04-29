public class CalciFunctions{

public static void main(String [] args){
	
	

	System.out.println("\n"+tan(45));
	System.out.println("\n"+cot(45));
	System.out.println("\n"+ combination(0, 2));
	

}
//Functions for addition

public static double add(double num1, double num2){

	return num1 + num2;

}

//Functions for subtraction

public static double sub(double num1, double num2){

	return num1 - num2;

}
//Function for multiplication
public static double mul(double num1, double num2){

	return num1 * num2;

}

//Function for dividing
public static double div(double num1, double num2){

	return num1 / num2;

}

//Function for finding power
public static double pow(double base, double power){

    double result = 1f;

    while (power != 0) {
      result *= base;
      --power;
    }
    return result;
    
    

}
//Function for finding square root value
public static double sqrt(double num1){
	
	double i = 0;
	for(; i < num1/2;i++){
		if(i*i == num1){
		
		break;
		}
		
	}
	return i;

}

//Function for finding factorial of a number
public static long fact(int num1){
	if(num1 == 1 || num1 ==1){
	return 1;
}

return num1*fact(num1-1);
	

}

//Function for finding sin value of a number
public static double sin(double num1){
	
	
	num1 = (double) Math.toRadians(num1);
	return (double) Math.sin(num1);
	
}

//Function for finding cos value of a number
public static double cos(double num1){
	
	
	num1 = (double) Math.toRadians(num1);
	return (double) Math.cos(num1);
	
}

//Function for finding tan value of a number
public static double tan(double num1){
	
	
	
	return sin(num1)/cos(num1);
	
}
//Function for finding cot value of a number
public static double cot(double num1){
	
	
	
	return 1/tan(num1);
	
}

public static double inverseSine(double value) {
        return Math.asin(value);
}
    
public static double inverseCosine(double value) {
        return Math.acos(value);
}
    
public static double inverseTangent(double value) {
        return Math.atan(value);
}
    
// Hyperbolic functions
public static double hyperbolicSine(double angle) {
        return Math.sinh(angle);
}
    
public static double hyperbolicCosine(double angle) {
        return Math.cosh(angle);
}
    
public static double hyperbolicTangent(double angle) {
        return Math.tanh(angle);
}

// Logarithm function (base 10)
public static double log(double num) {
        return Math.log10(num);
    }
    
// Natural logarithm function (base e)
public static double ln(double num) {
        return Math.log(num);
    }
    
//Funtion for permutation of n objects for r selection
public static long permutation(int n, int r){

	if (n < r){
            return 0;}

	long a = fact(n-r);

	return (fact(n))/a;
}

//Function for selection of r objects taken out of n objects irrespective of the object arrangement.

public static long combination(int n, int r){

	if (n < r){
            return 0;}
	
	return (fact(n)/(fact(r)*fact(n-r)));
}

}

