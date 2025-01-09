package main.arrayExample;

public class MaximumDifferenceExample {

    public static void main(String[] args) {
        int[] arr = {30,10,8,2};
        System.out.println(getMaximumDifference(arr));
    }

    public static int getMaximumDifference(int[] arr) {
        int max=0, min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max=arr[i];
            }
            if(arr[i] > max && min> arr[i]) {
                min = arr[i];
            }
        }
        return max-min;
    }
}
