package interviewquestions2026.Arrays;

import java.util.Arrays;

public class ReverseOfArray {
public static void main(String[] args) {
    int[] arr = new int[]{22, 10, 15, 99, 79, 14, 33};
    System.out.println("Original array: " + Arrays.toString(arr));
    int reverseArr[] = new int[arr.length];
    reverseArr = reverseArray(arr);
    System.out.println("Reversed array: " + Arrays.toString(reverseArr));
    }

    public static int[] reverseArray(int[] arr){
        if(arr == null || arr.length == 0) {
            System.out.println("Array is null or empty");
            return new int[]{};
        }
        //solving using the 2 pointer techinque
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
        return arr;  
    }

}
