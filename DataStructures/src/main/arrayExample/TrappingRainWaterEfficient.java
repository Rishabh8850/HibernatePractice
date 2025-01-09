package main.arrayExample;

public class TrappingRainWaterEfficient {

    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5};
        System.out.println(getMaxCapacity(arr));
    }

    public static int getMaxCapacity(int[] arr) {
        int res = 0;
        int[] lMax = new int[arr.length];
        int[] rMax = new int[arr.length];
        lMax[0] = arr[0];
        rMax[arr.length-1] = arr[arr.length-1];
        for(int i=1; i<arr.length; i++) {
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }
        for(int i = arr.length-2; i>=0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i+1]);
        }

        for(int i =1; i<arr.length-1; i++) {
            res += Math.min(lMax[i], rMax[i])-arr[i];
        }
        return res;
    }
}
