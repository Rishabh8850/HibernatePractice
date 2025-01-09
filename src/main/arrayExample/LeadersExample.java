package main.arrayExample;

public class LeadersExample {

    public static void main(String[] args) {
        int[] arr = {11,10,4,10,6,5,2};
        getAllLeaders(arr);
    }

    public static void getAllLeaders(int[] arr) {
        int length = arr.length;
        int curr_Leader = arr[length-1];
        System.out.println(curr_Leader);
        for(int i=length-2; i>=0; i--) {
            if(curr_Leader < arr[i]) {
                curr_Leader = arr[i];
                System.out.println(curr_Leader);
            }
        }
    }
}
