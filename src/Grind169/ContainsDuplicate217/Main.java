package Grind169.ContainsDuplicate217;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] test={1,2,3};

        System.out.println(containsDuplicate(test));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> values=new HashMap<>();
        Arrays.stream(nums).forEach(s->{
            if(!values.containsKey(s)){
                values.put(s,1);
            }
        });
        if (values.size()== nums.length){
            return false;
        }
        else {
            return true;
        }

    }
}
