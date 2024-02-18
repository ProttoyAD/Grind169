package Grind169.SquaresSorted977;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values={-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(values)));
    }

    public static int[] sortedSquares(int[] nums) {
        int start=0, end=nums.length-1;
        int count=end;
        boolean flag=true;
        int[] sortedArray=new int[nums.length];
        while (start<=end){
            if (nums[start]*nums[start]<nums[end]*nums[end]){
                sortedArray[count]=nums[end]*nums[end];
                end--;
                count--;
            }
            else{
                sortedArray[count]=nums[start]*nums[start];
                start++;
                count--;
            }

        }
        return sortedArray;
    }
}
