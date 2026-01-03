class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[neg]=nums[i];
                neg+=2;
            }else{
                ans[pos]=nums[i];
                pos+=2;
            }
        }
        return ans;
    }
}

/*
class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();      
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }else{
                pos.add(nums[i]);
            }
        }      
        for(int i=0;i<nums.length/2;i++){
            nums[i*2]=pos.get(i);
            nums[i*2+1]=neg.get(i);
        }
        return nums;
    }
}
*/
