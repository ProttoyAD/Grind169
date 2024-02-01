package Grind169.NumOf1Bits191;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(hammingWeight(00000000000000000000000000001011));
        int x=111111101;
//        System.out.println(x);
        System.out.println(hammingWeight(x));


    }

    public static int hammingWeight(int n) {
        int count=0;
        String[] arr=Integer.toBinaryString(n).split("");

        for (String s: arr){
            System.out.println(s);
            count=count+Integer.parseInt(s);
        }
        return count;
    }

    public int hammingWeightOptimal(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }


}
