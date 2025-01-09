package main.BitwiseOperator;

public class KthSetBitExample {

    public static void main(String[] args) {
        System.out.println(isKthBitSet(4,3));
    }

    public static boolean isKthBitSet(int num, int k) {
        return (((num>>k-1) & 1)!=0);
    }
}
