package Grind169.MajorityElement169;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        HashMap<Integer,Integer> result=new HashMap<>();
//        result.put(1,2);
//        result.put(2,3);

        int[] x={1,2,2,2,3};
        System.out.println(majorityElement(x));
        System.out.println(majority(x));
            }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> result=new HashMap<>();
        ArrayList<Integer> keys=new ArrayList<>();
        Arrays.stream(nums).forEach(s->{
            if (!result.containsKey(s)){
                result.put(s,1);
                keys.add(s);
            }
            else {
                result.replace(s,result.get(s)+1);
            }
        });
        int[] max=new int[1];
        keys.forEach(s->{
            if (result.get(s)>nums.length/2){
                max[0]=s;
            }
        });
        return max[0];
    }
    public static int majority(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2] ;
    }
//    the majority element occurs more than n/2 times,
//    and when the array is sorted, it will occupy the middle position.


}
