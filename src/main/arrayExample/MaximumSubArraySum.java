package main.arrayExample;

public class MaximumSubArraySum {

    public static void main(String[] args) {
        int[] arr = {-3,8,-2,4,-5,3};
        System.out.println(getMaxSubArraySum(arr));
    }

    public static int getMaxSubArraySum(int[] arr) {
        int getMaxSum = arr[0], res = arr[0];
        for(int i=1; i<arr.length; i++) {
            getMaxSum = Math.max((getMaxSum + arr[i]), arr[i]);
            res = Math.max(getMaxSum, res);
        }
        return res;
    }
}
