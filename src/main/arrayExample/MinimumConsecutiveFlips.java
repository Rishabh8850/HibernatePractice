package main.arrayExample;

public class MinimumConsecutiveFlips {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 0, 0, 1, 1};
        minConsecutiveFlip(arr);
    }

    public static void minConsecutiveFlip(int[] arr) {
        int res = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                if(arr[i] != arr[res]) {
                    System.out.print("From "+i+" to ");
                } else {
                    System.out.println(i-1);
                }
            }
            }
        if(arr[arr.length-1] != arr[res]) {
            System.out.println(arr.length-1);
        }
    }
}
