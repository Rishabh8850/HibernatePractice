package main.arrayExample;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[] arr = {10,20,7,0,0,20,0,11};
        moveZeroToEndExample(arr);
        for(int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] moveZeroToEndExample(int[] arr) {
        int res = 0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[res];
                arr[res] = temp;
                res++;
            }
        }
        return arr;
    }
}
