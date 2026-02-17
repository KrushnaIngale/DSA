public class BInarySubArraysWithSum_930 {
    public static void main(String[] args) {
        int[] nums={1,0,1,0,1};
        int goal=2;
        BInarySubArraysWithSum_930 b=new BInarySubArraysWithSum_930();
        System.out.println(b.numSubarraysWithSum(nums,goal));
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return lessThanSum(nums,goal)-lessThanSum(nums,goal-1);
    }
    int lessThanSum(int[] nums,int goal){
        if(goal<0) return 0;

        int n=nums.length;
        int l=0;
        int r=0;
        int sum=0;
        int count=0;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum1(int[] nums, int goal) {
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
