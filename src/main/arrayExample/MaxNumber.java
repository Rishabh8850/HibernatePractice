package main.arrayExample;

public class MaxNumber {

    public static void main(String[] args) {
        int[] arr = {8,5,20,10};
        //System.out.println(arr[maxNumber(arr)]);
        System.out.println(getLargestEfficient(arr));
    }

    public static int maxNumber(int[] arr) {
        int length = arr.length;
        for(int i=0; i<length; i++) {
            boolean isMax = true;
            for(int j=0; j<length; j++) {
                if(arr[j] > arr[i]) {
                    isMax = false;
                    break;
                }
            }
            if(isMax == true) {
                return i;
            }
        }
        return -1;
    }

    public static int getLargestEfficient(int[] arr) {
        int max = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
