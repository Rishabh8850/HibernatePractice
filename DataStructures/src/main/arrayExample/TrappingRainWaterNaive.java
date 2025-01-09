package main.arrayExample;

public class TrappingRainWaterNaive {

    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5};
        System.out.println(getMaxCapcity(arr));
    }

    public static int getMaxCapcity(int[] arr) {
        int res = 0;
        for(int i=1; i<arr.length; i++) {
            int lmax = arr[0];
            for(int j=0; j<=i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[arr.length -1];
            for (int j=i+1; j<arr.length; j++) {
                rmax = Math.max(rmax, arr[j]);
            }
            res += Math.min(lmax,rmax)-arr[i];
        }
        return res;
    }
}
