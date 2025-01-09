package main.FunctionsExample;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FunctionExample {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printName(name);
        int age = sc.nextInt();
        System.out.println(" is "+ voteEligibility(age));
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Multiplication of 2 numbers are : "+multiply(a,b));
        double r = sc.nextDouble();
        System.out.println("Peremeter of circle for radius "+ r + " = "+ findPeremeterOfCircle(r));
        int c = sc.nextInt();
        System.out.println(" Factorial of "+ c + " = "+findFactorial(c));
        System.out.println("Avg of 3 numbers : "+ findAvg(a,b,c));
        int n = sc.nextInt();
        System.out.println("Sum of first "+ n + " odd numbers = "+ sumOddNumbers(n));
        System.out.println("Max Number out of "+ a +","+ b + " is "+ findMax(a,b));*/
        /*System.out.println(greatestCommonFactor(3,6));*/
        fabonaciiSeries(10);
    }

    public static void printName(String name) {
        System.out.println("Name : "+ name.toUpperCase());
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static long findFactorial(int a) {
        if(a == 0) {
            return 1;
        }
        return a * findFactorial(a-1);
    }

    public static long sumOddNumbers(int n) {
        return IntStream.rangeClosed(1,n).filter(i -> i%2!=0).sum();
    }

    public static double findAvg(int a, int b, int c) {
        return(a+b+c)/3;
    }

    public static int findMax(int a, int b) {
        return a>b ? a : b;
    }

    public static double findPeremeterOfCircle(double r) {
        return 2*Math.PI*r;
    }

    public static String voteEligibility(int age) {
        if(age >= 18) {
            return "eligible for voting";
        } else {
            return "non Eligible for voting";
        }
    }

    public static int greatestCommonFactor(int a, int b) {
        if(b == 0)
        {
            return a;
        }
        return greatestCommonFactor(b,a%b);
    }

    public static void fabonaciiSeries(int length) {
        int[] nums = new int[length];
        nums[0] = 1;
        nums[1] = 1;
        System.out.print(nums[0]);
        System.out.print(nums[1]);
        if(length <=2) {
            return;
        }
        else {
            for(int i=2;i<length;i++) {
                nums[i] = nums[i-1] + nums[i-2];
                System.out.print(nums[i]);
            }
        }
    }
}
