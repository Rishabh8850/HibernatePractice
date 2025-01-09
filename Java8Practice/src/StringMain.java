import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Double a = null, b = null;
        System.out.println(Math.min(a,b));
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        int n = sc.nextInt();
        printPattern1(ch, n);
        System.out.println();
        printPattern2(ch, n);
        System.out.println();
        printPattern3(ch, n);
        System.out.println();
        printPattern4(ch, n);
        System.out.println();
        printPattern5(n);
        System.out.println();
        printPattern6(n);
        System.out.println();
        printPattern7(n);
        System.out.println();
        printPattern8(n);
        System.out.println();
        printPattern9(ch, n);
        System.out.println();
        printPattern10(n);
    }

    private static void printPattern10(int n) {
        for(int i=1; i<=n; i++) {
            int start = 0, end = 0;
            for(int j=1; j<=(n-i+1)/2; j++) {
                System.out.print("  ");
            }
            for(int j=(n+1)/2; j<((n+1)/2)+i; j++)
                System.out.print(i+" ");
            for(int j=0; j<=n; j++)
                System.out.print("  ");
            System.out.println();
        }
    }

    private static void printPattern9(String ch, int n) {
        for(int i = 0; i<n; i++) {
            for(int j=0;j<n-1-i;j++)
                System.out.print("  ");
            for(int j=0; j<n; j++)
                System.out.print(" *");
            System.out.println();
        }
    }

    private static void printPattern8(int n) {
        for(int i= 1; i<=n; i++) {
            for(int j= 1; j<=i; j++) {
                if((i+j)%2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    private static void printPattern7(int n) {
        int count =1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++)
                System.out.print(count++ + " ");
            System.out.println();
        }
    }

    private static void printPattern6(int n) {
        for(int i=n; i>0; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    private static void printPattern5(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    private static void printPattern4(String ch, int n) {
        for(int i=0;i<n;i++){
            for(int j=0; j<n-1-i; j++)
                System.out.print("  ");
            for(int j=0; j<=i; j++)
                System.out.print(" *");
            System.out.println();
        }
    }

    private static void printPattern3(String ch, int n) {
        for(int i=n; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printPattern2(String ch, int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void printPattern1(String ch, int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static long sum(int a) {
         long sum = 0, i=0;
        while(i<=a) {
            sum+=i;
            i++;
        }
        return sum;
    }
}
