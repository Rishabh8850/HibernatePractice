package main.arrayExample;

public class MaximumSubArraySumCircular {

    public static void main(String[] args) {
        int[] arr = {-3,4,6,-2};
        //System.out.println(getCircularSum(arr));
        System.out.println(Math.abs(arr[0]));
    }

    public static int getMaximumLinearSum(int[] arr) {
        int getMaxSum = arr[0], res = arr[0];
        for(int i=1; i<arr.length; i++) {
            getMaxSum = Math.max((getMaxSum+arr[i]), arr[i]);
            res = Math.max(getMaxSum, res);
        }
        return res;
    }

    public static int getCircularSum(int[] arr) {
        int get_linear_sum = getMaximumLinearSum(arr);
        if(get_linear_sum < 0) {
            return get_linear_sum;
        }
        int curr_sum = 0;
        for(int i=0; i<arr.length; i++) {
            curr_sum +=arr[i];
            arr[i] = -arr[i];
        }
        curr_sum = curr_sum+getMaximumLinearSum(arr);
        return Math.max(curr_sum, get_linear_sum);
    }
}
