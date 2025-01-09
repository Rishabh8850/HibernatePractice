package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int x = 4829;
        int num = 2382;
        String name = "rishabh,shukla";
        System.out.println(new HashSet<>(Arrays.asList(name.split(","))).size());
        System.out.println(digitCount(x));
        System.out.println(isPalindrome(num));
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
        System.out.println(trailingZero(12));
        System.out.println(trailingZeroOptimum(251));
        System.out.println(getHCF(10, 15));
        System.out.println(getHCFUclidOptimal(10,15));
        System.out.println(getLCM(10,15));
        System.out.println(getLCMOptimum(10,20));
        System.out.println(isPrime(9));
        System.out.println(isPrimeEfficient(11));
        System.out.println(isPrimeEfficientOptimum(11));
        printPrimeFactor(21);
        printPrimeFactorEfficient(21);
        printPrimeFactorOptimum(450);
        printDivisors(25);
        printDivisorsOptimum(25);
        printAllPrimeNumbersBruteForce(11);
        printAllPrimeNumbersEfficient(11);
        printAllPrimeNumbersOptimum(11);
        System.out.println(powerBruteForce(2,3));
        System.out.println(powerEfficient(2,3));
        System.out.println(powerOptimum(2,3));
        System.out.println(mulModulo(1000000007,1000000007));
    }

    private static long mulModulo(long a, long b) {
        long m = (long) Math.pow(10,9) + 7;
        return a%m*b%m;
    }

    private static int powerOptimum(int a, int b) {
        int res = 1;
        while(b>0) {
            if(b%2 != 0) {
                res = res * a;
            }
            a = a*a;
            b = b>>1;
        }
        return res;
    }

    private static int powerEfficient(int a, int b) {
        if(b==0){
           return 1;
        }
        int temp = powerEfficient(a,b/2);
        temp = temp * temp;
        if(b%2 == 0) {
            return temp;
        } else {
           return temp * a;
        }
    }

    private static int powerBruteForce(int a, int b) {
        int res = 1;
        for(int i= 0; i<b; i++) {
            res = res * a;
        }
        return res;
    }

    private static void printAllPrimeNumbersOptimum(int n) {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i =2; i<=n; i++) {
            if(isPrimeEfficientOptimum(i)) {
                System.out.println(i);
                for(int j = i*i; j<=n; j= j+i) {
                    arr[j]=false;
                }
            }
        }
    }

    private static void printAllPrimeNumbersEfficient(int n) {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i = 2; i*i<=n; i++)
        {
            if(isPrimeEfficientOptimum(i)) {
                for(int j = 2*i; j<=n; j=j+i) {
                    arr[j] = false;
                }
            }
        }
        for(int i=2; i<=n; i++) {
            if(arr[i]) {
                System.out.println(i);
            }
        }
    }

    private static void printAllPrimeNumbersBruteForce(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrimeEfficientOptimum(i)) {
                System.out.println(i);
            }
        }
    }

    private static void printDivisorsOptimum(int n) {
        int i;
        for(i=1; i*i<n; i++) {
            if(n%i == 0)
                System.out.println(i);
        }
        for(;i>=1;i--) {
            if(n%i == 0)
                System.out.println(n/i);
        }
    }

    private static void printDivisors(int n) {
        for(int i = 1; i<=n;i++) {
            if(n%i == 0)
            {
                System.out.println(i);
            }
        }
    }

    private static void printPrimeFactorOptimum(int n) {
        if(n <= 1)
            return;
        while(n%2 == 0) {
            System.out.println(2);
            n=n/2;
        }
        while(n%3 == 0) {
            System.out.println(3);
            n=n/3;
        }
        for(int i=5; i*i<=n; i=i+6) {
            while(n%i==0) {
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>3) {
            System.out.println(n);
        }
    }

    private static void printPrimeFactorEfficient(int n) {
        if(n==1)
            return;
        for(int i=2; i*i<=n; i++) {
            while(n%i == 0) {
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1) {
            System.out.println(n);
        }
    }

    private static void printPrimeFactor(int n) {
        if(n == 1) {
            return;
        }
        for(int i=2; i<n; i++) {
            if(isPrimeEfficientOptimum(i)) {
                int x = i;
                while(n%x == 0)
                {
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }

    private static boolean isPrimeEfficientOptimum(int n) {
        if(n == 1)
            return false;
        if(n == 2 || n == 3)
            return true;
        if(n%2 == 0 || n%3 == 0)
            return false;
        for(int i=5; i*i<=n; i = i+6) {
            if(n%i == 0 || n%(i+2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeEfficient(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i*i < n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int n) {
        if(n == 0) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getLCMOptimum(int a, int b) {
        int res = getHCFUclidOptimal(a,b);
        return a*b/res;
    }

    private static int getLCM(int a, int b) {
        int res = Math.max(a,b);
        while(true) {
            if(res%a == 0 && res%b == 0) {
                break;
            }
            res++;
        }
        return res;
    }

    private static int getHCFUclidOptimal(int a, int b) {
        if(b!=0) {
            a=getHCFUclid(b,a%b);
        }
        return a;
    }

    private static int getHCFUclid(int a, int b) {
        while(a != b) {
            if(a>b) {
                a = a-b;
            } else if (b>a) {
                b = b-a;
            }
        }
        return b;
    }

    private static int getHCF(int a, int b) {
        int res = Math.min(a,b);
        while(true) {
            if(a%res == 0 && b%res == 0)
                break;
            else
                res--;
        }
        return res;
    }

    private static int trailingZeroOptimum(int n) {
        int res = 0;
        if(n < 5) {
            return 0;
        }
        for(int i = 5; i <= n; i=i*5) {
            res += n/i;
        }
        return res;
    }

    private static int trailingZero(int i) {
        int fact = 1;
        int res = 0;
        if(i == 0 || i == 1) {
            fact = 1;
        }
        for(int j = 2; j <= i; j++) {
            fact = fact*j;
        }
        while(fact%10 == 0) {
            res++;
            fact = fact/10;
        }
        return res;
    }

    private static int factorialRecursive(int i) {
        if(i == 0) {
            return 1;
        }
        return factorialRecursive(i-1) * i;
    }

    private static int factorialLoop(int i) {
        if(i == 0 || i == 1) {
            return 1;
        }
        int num = 1;
        for(int j = 2; j <= i; j++) {
           num = num * j;
        }
        return num;
    }

    private static boolean isPalindrome(int num) {
        int rev = 0;
        int temp = num;
        while(temp%10 != 0) {
            int lastDgt = temp%10;
            rev = rev*10+lastDgt;
            temp = temp/10;
        }
        return (rev == num);
    }

    private static int digitCount(int x) {
        int digitCount = 0;
        while(x!=0) {
            digitCount++;
            x=x/10;
        }
        return digitCount;
    }

    private static int sumOfFirstNNaturalNumbers(int x) {
        int sum = x*(x+1)/2;
        return sum;
    }
}
