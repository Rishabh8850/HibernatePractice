package main.Recursion;

public class JosephusExample {

    public static void main(String[] args) {
        System.out.println(josephusSolution(7,3));
    }

    public static int josephusSolution(int n, int k) {
        if(n==1) {
            return 1;
        }
        return (josephusSolution(n-1,k)+k-1)%n+1;
    }
}
