package Grind169.ReverseBit190;

public class Main {
    public static void main(String[] args) {

    }
    public int reverseBits(int n) {
        int result=0;
        String temp=Integer.toBinaryString(n);
        temp.replace('0','a');
        temp.replace('1','b');
        temp.replace('a','1');
        temp.replace('b','0');
        result=Integer.parseInt(temp,2);
        return result;
    }
}
