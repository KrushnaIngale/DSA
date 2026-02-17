

public class Max_consecutive_ones_3_1004 {
    public static void main(String[] args) {
        int[] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        Max_consecutive_ones_3_1004 m=new Max_consecutive_ones_3_1004();
        System.out.println(m.longestOnes(nums,k));
    }

    public int longestOnes(int[] nums, int k) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int zeros=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zeros++;
                }
                if(zeros<=k){
                    max=Math.max(max,j-i+1);
                }else{
                    break;
                } 
            }
        }
        return max;
    }
}
