public class Jump_game2_45 {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        Jump_game2_45 j=new Jump_game2_45();
        System.out.println(j.jump(nums));
    }
    public int jump(int[] nums) {
        int jumps=0;
        int l=0;
        int r=0;
        for(int i=0;i<nums.length-1;i++){
            r=Math.max(r,i+nums[i]);
            if(i==l){
                jumps++;
                l=r;
            }   
        }
        return jumps;
    }
    
}
