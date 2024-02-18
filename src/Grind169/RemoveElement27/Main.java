package Grind169.RemoveElement27;

public class Main {
    public static void main(String[] args) {
       int[] arr={3,2,2,3};
        System.out.println(removeElement(arr,3));
    }

    public static int removeElement(int[] nums, int val) {
        int start=0;
        int end=nums.length-1;
        while(end>=start){
            if(nums[start]==val){
                if(nums[end]!=val){
                    nums[start]=nums[end];
                    end--;
                    start++;
                }
                else end--;
            }
            else start++;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        return start;
    }
}
