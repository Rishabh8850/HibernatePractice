package main.arrayExample;

public class MajorityElements {

    public static void main(String[] args) {
        int[] arr = {8,8,6,6,6,6,4,6};
        System.out.println(getMajorityElementsIndex(arr));
    }

    public static int getMajorityElementsIndex(int[] arr) {
        int res = 0, count=1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] == arr[res]) {
                    count++;
            } else {
                count--;
            } if(count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == arr[res])
            {
                count++;
            }
        }
        if(count<=arr.length/2) {
            return -1;
        }
        return res;
    }
}
