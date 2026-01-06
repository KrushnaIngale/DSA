import java.util.*;
public class Majority_element2_229 {
    public static void main(String[] args) {
        Majority_element2_229 obj = new Majority_element2_229();
        int[] nums = {3,2,3,2,2};
        List<Integer> result = obj.majorityElement(nums);
        System.out.println(result);
    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length/3+1;
        for(int i=0;i<nums.length;i++){
            int el=nums[i];
            mpp.put(el,mpp.getOrDefault(el,0)+1);
            if(mpp.get(el)==n){
                ans.add(el);
            }
        }
        
        return ans;
    }
    public List<Integer> majorityElement1(int[] nums) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(ans.size()==0 || ans.get(0)!=nums[i]){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                    if(count > (nums.length/3) && !ans.contains(nums[i])){
                        ans.add(nums[i]);
                    }
                }
            }   
            if(ans.size()==2){
                break;
            }         
        }
        return ans;
    }
}