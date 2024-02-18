package Grind169.ConsecutiveOnes1004;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[] input={0,0,1,1,1,0,0};
        System.out.println(longestOnes(input, 0));
    }
        public static int longestOnes(int[] nums, int k) {
            Queue<Integer> zeros=new LinkedList<>();
            int zero=0;
            int current=0;
            int max=0;
            int tail=-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    if(zeros.size()==k){
                        current=i-tail-1;
                        max=Math.max(current,max);
                        if (!zeros.isEmpty()){
                            tail=zeros.poll();
                        }
                        else {
                            tail=i;
                        }
                    }
                    if(k!=0) zeros.offer(i);

                }
                else if (i==nums.length-1){
                    current=i-tail;
                    max=Math.max(current,max);
                }
            }
            return max;
        }

}
