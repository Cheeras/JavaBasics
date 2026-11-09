package interviewquestions2026.Arrays;

public class FindLargestNumber {
    public static void main(String[] args){
        int [] arr = {22,10,15,99,79,14,33};
        int largest = Integer.MIN_VALUE;
    for(int i=0; i< arr.length; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
    System.out.println("The largest number in the array is: " + largest);
    }
}
