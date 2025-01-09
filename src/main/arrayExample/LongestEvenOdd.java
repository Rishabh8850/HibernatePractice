package main.arrayExample;

public class LongestEvenOdd {

    public static void main(String[] args) {
        int[] arr = {10,12,14,7,8};
        System.out.println(getLongestEvenOddLength(arr));
    }

    public static int getLongestEvenOddLength(int[] arr) {
       int count = 1;
       int maxLength = 1;
       for(int i =1; i< arr.length; i++) {
           if((arr[i]%2 == 0 && arr[i-1]%2 != 0) ||
                   (arr[i]%2 != 0 && arr[i-1]%2 == 0)) {
               count++;
               maxLength = Math.max(maxLength, count);
           } else {
               count = 1;
           }
       }
       return maxLength;
    }
}
