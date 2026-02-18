public class CountNo_of_NiceSubarrays_1248 {
    public static void main(String[] args) {
        int[] nums={2,2,2,1,2,2,1,2,2,2};
        int k=2;
        CountNo_of_NiceSubarrays_1248 c=new CountNo_of_NiceSubarrays_1248();
        System.out.println(c.numberOfSubarrays(nums,k));
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return lessThanK(nums,k)-lessThanK(nums,k-1);
    }
    int lessThanK(int[] nums,int k){
        int n=nums.length;
        int l=0;
        int r=0;
        int count=0;
        int sum=0;
        while(r<n){
            sum+=nums[r]%2;
            while(sum>k){
                sum-=nums[l]%2;
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}
