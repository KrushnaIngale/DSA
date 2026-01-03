import java.util.*;
class TwoSum {
    public static void main(String [] args){
    int[] nums={2,11,15,7};
    nums=twoSum(nums,9);
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]);
    }
  }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=1;i<nums.length;i++){

            for(int j=i;j<nums.length;j++){

                if(nums[j-i]+nums[j]==target){

                    return new int[] { j - i, j };

                }

            }

        }

        return new int[] {};
    }
}
