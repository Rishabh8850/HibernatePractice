package main.FunctionsExample;

public class SetBitsExample {

    public static void main(String[] args) {
        int n=4, res=0;
        while(n>0) {
            n=n&(n-1);
            res++;
        }
        System.out.println(res);
    }
}
