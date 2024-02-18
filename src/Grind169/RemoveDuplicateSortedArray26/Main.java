package Grind169.RemoveDuplicateSortedArray26;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] nums) {
        Map<Integer,Boolean> occured=new HashMap<>();
        int index=0;
        for(int i: nums){
            if(occured.containsKey(i)) continue;
            else{
                occured.put(i,true);
                nums[index]=i;
                index++;
            }
        }
        return index;
    }
}
