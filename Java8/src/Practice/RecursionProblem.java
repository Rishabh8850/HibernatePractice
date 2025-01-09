package Practice;

public class RecursionProblem {
    public static void main(String[] args) {
        printNto1(6);
        System.out.println();
        print1toN(6);
        System.out.println();
        System.out.println(fatorialRecursion(5));
        System.out.println(naturalNumberSumRecursion(10));
        System.out.println(isPalindromRecursion("abccb"));
        System.out.println(sumOfDigitRecursion(483));
        System.out.println(maxPieces(23,11,9,12));
        printAllSubset("ABC");
        //System.out.println(true == "TRUE");
    }

    private static void printAllSubset(String s) {
        printAllSubset(s, "", 0);
    }

    public static void printAllSubset(String s, String start, int index) {
        if(index == s.length()) {
            System.out.println(start);
            return;
        }
        printAllSubset(s,start,index+1);
        printAllSubset(s,start+s.charAt(index), index+1);
    }

    private static int maxPieces(int i, int a, int b, int c) {
        if(i==0)
            return 0;
        if(i<0)
            return -1;
        int response = Math.max(maxPieces(i-a, a, b, c), Math.max(maxPieces(i-b,a,b,c),maxPieces(i-c,a,b,c)));
        if(response==-1)
        {
            return response;
        }
        return response+1;
    }

    private static int sumOfDigitRecursion(int N) {
        if(N==0) {
            return 0;
        }
        return N%10 + sumOfDigitRecursion(N/10);
    }

    private static boolean isPalindromRecursion(String s) {
        return isPalindromRecursion(s,0,s.length()-1);
    }

    private static boolean isPalindromRecursion(String s, int start, int end) {
        if(start >= end) {
            return true;
        }
        return (s.charAt(start) == s.charAt(end) && isPalindromRecursion(s,start+1,end-1));
    }

    private static int naturalNumberSumRecursion(int N) {
        if(N==0) {
            return 0;
        }
        return N+naturalNumberSumRecursion(N-1);
    }

    private static int fatorialRecursion(int N) {
        if(N==0) {
            return 1;
        }
        return N*fatorialRecursion(N-1);
    }

    private static void print1toN(int N) {
        if(N==0) {
            return;
        }
        print1toN(N-1);
        System.out.print(N+",");
    }

    private static void printNto1(int N) {
        if(N==0) {
            return;
        }
        System.out.print(N+",");
        printNto1(N-1);
    }
}
