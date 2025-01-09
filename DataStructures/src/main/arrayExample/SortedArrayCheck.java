package main.arrayExample;

public class SortedArrayCheck {

    public static void main(String[] args) {
        int[] arr = {5,8,10,12};
        System.out.println(isSortedArray(arr));
    }

    public static boolean isSortedArray(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
