package Grind169.MoveZero273;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input={0,1,0,3,12};
        moveZeroes(input);
    }

    public static void moveZeroes(int[] nums) {
        int zeroCount=0;
        for(int i=0; i< nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else{
                nums[i-zeroCount]=nums[i];
            }
        }
        for (int i=0;i<zeroCount;i++){
            nums[nums.length-1-i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
