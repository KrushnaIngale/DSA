import java.util.*;
public class ThreeSum_15 {
    public static void main(String[] args) {
        ThreeSum_15 obj = new ThreeSum_15();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = obj.threeSum(nums);
        System.out.println(result);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>ans=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
