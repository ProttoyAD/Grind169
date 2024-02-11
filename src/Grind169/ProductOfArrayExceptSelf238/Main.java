package Grind169.ProductOfArrayExceptSelf238;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input={1,2,3,4,5};
        System.out.println(Arrays.toString(productExceptSelf(input)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int mul=1;
        int totalZero=0;
        for (int i: nums){
            if (i==0 ){
                if (totalZero>0){
                    mul=0;
                    break;
                }
                else {
                    totalZero++;
                }
            }
            else{
                mul *= i;
            }
        }
        System.out.println(mul);
        for (int i=0; i<nums.length;i++){
            if (nums[i]==0){
                result[i]=mul;
            }
            else {
                if (totalZero == 1) {
                    result[i] = 0;
                } else {
                    result[i] = mul / nums[i];
                }
            }
        }
        return result;
    }
}
