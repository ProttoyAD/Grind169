package Grind169.RemoveDuplicatesSorted80;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int count=1;
        int occured=1;
        int index=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                if(occured==2) continue;
                nums[index]=nums[i];
                count++;
                index++;
                occured++;
            }
            else{
                nums[index]=nums[i];
                occured=1;
                index++;
                count++;
            }
        }
        return count;
    }
}
