package main.arrayExample;

public class FrequencyInSortedArrayExample {

    public static void main(String[] args) {
        int[] arr = {40,10,10,10};
        getFrequencies(arr);
    }

    public static void getFrequencies(int[] arr) {
        int length = arr.length, count = 1;
        if(arr[0] == arr[length-1]) {
            System.out.println(arr[0]+"-"+length);
        } else {
            for (int i = 1; i < length; i++) {
                if (arr[i - 1] == arr[i]) {
                    count++;
                    continue;
                }
                System.out.println(arr[i - 1] + "  " + count);
                count = 1;
            }
            System.out.println(arr[length - 1] + "  " + count);
        }
    }
}
