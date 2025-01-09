package main.arrayExample;

public class MaximumConsecutive1s {

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,1,0,1,1};
        int[] arr1 = {1,1,1,1};
        System.out.println(getMaxConsecutive1(arr1));
    }

    public static int getMaxConsecutive1(int[] arr) {
        int length = arr.length;
        int max = 0, count = 0;
        for(int i = 0; i<length; i++) {
            if(arr[i] == 0) {
                count=0;
            }
            else {
                count++;
                max=Math.max(max, count);
            }
        }
        return max;
    }
}
