package main.Recursion;

import java.util.Scanner;

public class AllPermutationSubset {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String str = sc.next();
        allProbableSubset(str,0,str.length()-1);*/
        System.out.println(reverseExponentiation(2));
    }

    public static void allProbableSubset(String str, int start, int end) {
        if(start == end) {
            System.out.println(str);
        }
        else {
            for(int i = start; i<=end; i++) {
                str = swap(str, start, i);
                allProbableSubset(str, start+1, end);
                str = swap(str, start,i);
            }
        }
    }

    private static String swap(String str, int start, int i) {
        char temp;
        char[] ch = str.toCharArray();
        temp = ch[start];
        ch[start] = ch[i];
        ch[i] = temp;
        return String.valueOf(ch);
    }

    public static int reverseExponentiation(int n) {
        // code here
        int k = reverseNumber(n);
        return (int) Math.pow(n,k);
    }

    public static int reverseNumber(int n) {
        int rev = 0;
        int temp = n;
        while(temp==0) {
            rev = rev*10+temp%10;
            temp = temp/10;
        }
        return rev;
    }
}
