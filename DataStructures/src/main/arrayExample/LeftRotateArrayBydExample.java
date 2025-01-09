package main.arrayExample;

public class LeftRotateArrayBydExample {

    public static void main(String[] args) {
        int[] arr = {10,20,3,4,6};
        leftRotateArrayBydElements(arr, 3);
        for(int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] leftRotateArrayBydElements(int[] arr, int d) {
        int length = arr.length;
        int[] temp = new int[d];
        for(int i=0; i<d; i++) {
            temp[i] = arr[i];
        }
        for(int i=d; i<length; i++) {
            arr[i-d] = arr[i];
        }
        for(int i=0; i<d; i++) {
            arr[length-d+i] = temp[i];
        }
        return arr;
    }
}
