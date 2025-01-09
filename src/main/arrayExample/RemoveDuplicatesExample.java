package main.arrayExample;

public class RemoveDuplicatesExample {

    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30,30,40,50};
        System.out.println(distinctArraySize(arr));
    }

    public static int distinctArraySize(int[] arr) {
        int count =1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[count-1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}
