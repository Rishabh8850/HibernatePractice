// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int[] arr = {5,7,9,12,18};
        int[] res = sum(arr, 27);
        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(Math.min(2,4));
        }

    private static int[] sum(int[] arr, int i) {
        int[] res = new int[2];
        int left = 0, right = arr.length -1;
        while(left < right) {
            int curr_sum = arr[left] + arr[right];
            if(curr_sum == i) {
              res[0] = left+1;
              res[1] = right+1;
              break;
            }
            else if(curr_sum < i) {
                left +=1;
            }
            else {
                right -=1;
            }
    }
        return res;
}
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}