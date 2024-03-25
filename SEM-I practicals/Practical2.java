//Java code to sum array elements using recursion

public class Practical2 {
    
    private static int sumArray(int[] arr, int index){

        if(index == arr.length-1){

            return arr[index];
        }

        return arr[index]+sumArray(arr, index+1);
    }
    public static void main(String[] args) {
        
        int arr[] = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr.length);
        System.out.println(sumArray(arr, 0));

    }
}
