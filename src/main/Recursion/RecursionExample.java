package main.Recursion;

public class RecursionExample {

    public static void main(String[] args) {
        /*printNTo1(10);
        System.out.println("1 to N : ");
        print1ToN(10,1);*/
        System.out.println(sumNNaturalNumbers(50));
        String str= "MalayalaM";
        System.out.println(isPalindrome(str, 0, str.length()-1));
        System.out.println();
        System.out.println(sumOfDigit(9983));
        System.out.println();
        System.out.println(maxRopeCutting(5,4,2,1));
    }

    public static void printNTo1(int n) {
       if(n==0) {
           return;
       }
       System.out.println(n);
       printNTo1(n-1);
    }

    public static void print1ToN(int n, int count) {
        if(count>n) {
            return;
        }
        System.out.println(count);
        print1ToN(n, count+1);
    }

    public static int sumNNaturalNumbers(int n) {
        if(n==0) {
            return n;
        }
        return n+sumNNaturalNumbers(n-1);
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if(start>=end)
            return true;
        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start+1, end-1);
    }

    public static int sumOfDigit(int n) {
        if(n==0) {
            return 0;
        }
        return n%10+sumOfDigit(n/10);
    }

    public static int maxRopeCutting(int n, int a,int b,int c) {
        if(n==0) {
            return 0;
        }
        if(n<0) {
            return -1;
        }
        int res = Math.max(maxRopeCutting(n-a,a,b,c),Math.max(maxRopeCutting(n-b,a,b,c),maxRopeCutting(n-c,a,b,c)));
        if(res==-1) {
            return -1;
        }
        return res+1;
    }
}
