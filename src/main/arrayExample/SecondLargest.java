package main.arrayExample;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {8,5,20,10};
        System.out.println(secondLargestEfficient(arr));

    }

    public static int getSecondLargest(int[] arr) {
        int largetIndex = getLargest(arr);
        int secLargestIndex = -1; //for handling boundary condition if all the elements are same
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != arr[largetIndex]) {
                if(secLargestIndex == -1) {
                    secLargestIndex = i;
                } else if (arr[i]>arr[secLargestIndex]) {
                    secLargestIndex = i;
                }
            }
        }
        return secLargestIndex;
    }

    private static int getLargest(int[] arr) {
        int largest = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    public static int secondLargestEfficient(int[] arr) {
        int secondLargest = -1, largest = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] != largest) {
                if(secondLargest == 0 || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }
        return secondLargest;
    }
}
