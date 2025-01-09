package main.BitwiseOperator;

public class CountSetBits {

    public static void main(String[] args) {
        System.out.println(countSetBitsExample(31));
        System.out.println("Number is power of 2 : "+ isNumberpowerOf2(15));
    }

    private static boolean isNumberpowerOf2(int i) {
        return (i&(i-1)) == 0;
    }

    private static int countSetBitsExample(int i) {
        int res = 0;
        while(i>0){
            i = i&(i-1);
            res++;
        }
        return res;
    }
}
