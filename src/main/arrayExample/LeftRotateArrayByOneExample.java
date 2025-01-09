package main.arrayExample;

public class LeftRotateArrayByOneExample {

    public static void main(String[] args) {
        int[] arr = {5,8,4,10};
        leftRotateArray(arr);
        for(int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] leftRotateArray(int[] arr) {
        int length = arr.length;
        int temp = arr[0];
        for(int i =1; i<length; i++) {
            arr[i-1] = arr[i];
        }
        arr[length-1] = temp;
        return arr;
    }
}
