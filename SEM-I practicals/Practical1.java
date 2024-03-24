// Q1.  Write a c program to
//  1. print factorial of a number. 
// 2. print sum of digits in array of 10. 
// 3. Matrix addition of 3X3

public class Practical1{

private static long fact(long number){
    
    if(number==1){
        return number;
    }

    return number*fact(number-1) ;
}

private static int sumArray(int[] arr){

    int sum = 0;
    for(int number : arr){
        sum += number;
    }
    return sum;
}

private static int[][] matrixAddition(int[][] mat1, int[][] mat2){

    int[][] answer = new int[3][3];
    for(int row = 0;row<3;row++){
        for(int col = 0; col<3; col++){

            answer[row][col] = mat1[row][col] + mat2[row][col];
        }

    }

    return answer;
}

private static void print2DArray(int[][] mat){

    for(int row = 0;row<3;row++){
        System.out.println('\n');
        for(int col = 0; col<3; col++){

            System.out.println(mat[row][col]);
        }

    }

}

public static void main(String[] args){

    System.out.println(fact(5));

    int arr[] = new int[]{1, 2, 3, 4, 5};
    int arr1[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(sumArray(arr));
    print2DArray(matrixAddition(arr1, arr2));



}

}