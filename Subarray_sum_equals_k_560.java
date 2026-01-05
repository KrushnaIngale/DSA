import java.util.HashMap;
import java.util.Map;

public class Subarray_sum_equals_k_560 {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        Subarray_sum_equals_k_560 solver = new Subarray_sum_equals_k_560();
        int result = solver.subarraySum(nums, k);
        System.out.println(result);
    }
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int req=sum-k;
            count+=mpp.getOrDefault(req,0);
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public int subarraySum1(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k) count++;
            }
        }
        return count;
    }
}
