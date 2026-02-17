public class BInarySubArraysWithSum_930 {
    public static void main(String[] args) {
        int[] nums={1,0,1,0,1};
        int goal=2;
        BInarySubArraysWithSum_930 b=new BInarySubArraysWithSum_930();
        System.out.println(b.numSubarraysWithSum(nums,goal));
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal){
                    count++;
                }
            }
        }
        return count;
    }
}
