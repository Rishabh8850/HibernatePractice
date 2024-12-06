package com.rish.hibernate.app;

import java.util.Arrays;

public class MathematicsPractice {
    public static void main(String[] args) {
        System.out.println(countDigit(230));
        System.out.println(isPalindrome(2322));
        System.out.println(factorial(5));
        System.out.println(trailingZeroFact(5));
        System.out.println(getHCF(5,15));
        System.out.println(getLCM(5,15));
        System.out.println(isPrime(65));
        primeFactor(450);
        System.out.println();
        allDivisors(176);
        allPrimes(20);
        System.out.println();
        System.out.println(power2(31));
        System.out.println(iskthBitSet(5,1));
        System.out.println(noOfSetBit(31));
        System.out.println(noOfSetBitOptimum(31));
        System.out.println(getRightMostSetBit(16));
        System.out.println(maxPeices(23,11,9,12));
        System.out.println(isPalindromeRecursive("malayalam"));
    }

    private static boolean isPalindromeRecursive(String s) {
        return isPalindromeRecursive(s, 0, s.length()-1);
    }

    private static boolean isPalindromeRecursive(String s, int start, int end) {
        if(start>=end) {
            return true;
        }
        return ((s.charAt(start) == s.charAt(end)) && isPalindromeRecursive(s,start+1, end-1));
    }
    private static int maxPeices(int n, int a, int b, int c) {
        if(n == 0) {
            return 0;
        }
        if(n<0) {
            return -1;
        }
        int response = Math.max(maxPeices(n-a, a, b, c),Math.max(maxPeices(n-b,a,b,c), maxPeices(n-c,a,b,c)));
        if(response == -1) {
            return -1;
        }
        return response+1;
    }

    private static int getRightMostSetBit(int i) {
        int k = i & ~(i-1),count = 0;
        while(k>0) {
            k = k>>1;
            count++;
        }
        return count;
    }

    private static int noOfSetBitOptimum(int n) {
        int [] tbl = new int[256];
        tbl[0] = 0;
        for(int i = 1; i <=255; i++) {
            tbl[i] = tbl[i&(i-1)] +1;
        }
        return tbl[n&255] +
                tbl[n>>8 & 255] +
                tbl[n>>16 & 256] +
                tbl[n>>24];
    }

    private static int noOfSetBit(int n) {
        int res = 0;
        while(n>0) {
            n=n&(n-1);
            res++;
        }
        return res;
        // time complexity O(number of set Bits)
    }

    private static boolean iskthBitSet(int a, int k) {
        return ((a>>k-1) & 1) != 0;
    }

    private static boolean power2(int n) {
        if((n & n-1) == 0)
            return true;
        return false;
    }

    private static void allPrimes(int n) {
        boolean[] primeArray = new boolean[n+1];
        Arrays.fill(primeArray, true);
        for(int i=2; i<=n; i++) {
            if(primeArray[i]) {
                System.out.print(i + ",");
                for(int j=i*i; j<=n; j=j+i) {
                    if(primeArray[j]) {
                        primeArray[j] = false;
                    }
                }
            }
        }
    }

    private static void allDivisors(int n) {
        int i;
        for(i = 1; i*i <= n; i++) {
            if(n/i != i && n%i==0) {
                System.out.print(i + ",");
            }
        }
        for(; i>=1; i--) {
            if(n%i == 0) {
                System.out.print(n/i+",");
            }
        }
        System.out.println();
    }

    private static void primeFactor(int n) {
        while(n%2 == 0) {
            System.out.print(2 + ",");
            n=n/2;
        }
        while(n%3 == 0) {
            System.out.print(3 + ",");
            n=n/3;
        }
        for(int i = 5; i*i<=n; i=i+6) {
            while(n%i == 0) {
                System.out.print(i + ",");
                n=n/i;
            }
            while(n%(i+2) == 0) {
                System.out.print((i+2) + ",");
                n=n/(i+2);
            }
        }
        if(n>3) {
            System.out.print(n+"\n");
        }
    }

    private static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        if(n==2 || n==3) {
            return true;
        }
        if(n%2 == 0 || n%3 == 0) {
            return false;
        }
        for(int i = 5; i*i<=n; i=i+6) {
            if(n%i == 0 || n%(i+2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getLCM(int a, int b) {
        return a*b/getHCF(a,b);
    }

    private static int getHCF(int a, int b) {
        if(b==0) {
            return a;
        }
        return getHCF(b,a%b);
    }

    private static int trailingZeroFact(int n) {
        int count = 0;
        if(n < 5) {
            return 0;
        }
        for(int i = 5; i<=n; i=i*5) {
            count = count + n/i;
        }
        return count;
    }

    private static int factorial(int n) {
        int fact = 1;
        if(n==0 || n==1) {
            return 1;
        }
        for(int i = 2; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    private static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while(temp!=0) {
            int lastDigit = temp%10;
            rev = rev*10 + lastDigit;
            temp = temp/10;
        }
        return rev == n;
    }

    private static int countDigit(int n) {
        int count = 0;
        while(n!=0) {
            count++;
            n=n/10;
        }
        return count;
    }
}
