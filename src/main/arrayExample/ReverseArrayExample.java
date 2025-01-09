package main.arrayExample;

public class ReverseArrayExample {

    public static void main(String[] args) {
        int[] arr = {8,5,20,10,12};
        int[] arr1 = reverseArray(arr);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

    public static int[] reverseArray(int[] arr) {
        for(int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}
