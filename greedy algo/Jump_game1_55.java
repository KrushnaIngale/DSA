public class Jump_game1_55 {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        Jump_game1_55 j=new Jump_game1_55();
        System.out.println(j.canJump(nums));
    }
    public boolean canJump(int[] nums) {
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxIndex) return false;
            int sum=i+nums[i];
            maxIndex=Math.max(maxIndex,sum);
            if(maxIndex>=nums.length) return true;
        }
        return true;
    }
}
