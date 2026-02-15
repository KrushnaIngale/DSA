import java.util.Stack;

public class SumofSubArrayRanges_2104 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        SumofSubArrayRanges_2104 s=new SumofSubArrayRanges_2104();
        System.out.println(s.subArrayRanges(nums));
    }

    public long subArrayRanges(int[] nums) {
        return sumOfSubArrayMax(nums)-sumOfSubArrayMins(nums);
    }
    long sumOfSubArrayMins(int[] nums){
        int[] NSL=getNSL(nums);
        int[] NSR=getNSR(nums);
        long ans=0; 
        for(int i=0;i<nums.length;i++){
            long rt=NSL[i]-i;
            long lt=i-NSR[i];
            long totalWays=rt*lt;
            long totalSum=totalWays*nums[i];
            ans+=totalSum;
        }
        return ans;
    }
    long sumOfSubArrayMax(int[] nums){
        int[] NGL=getNGL(nums);
        int[] NGR=getNGR(nums);
        long ans=0; 
        for(int i=0;i<nums.length;i++){
            long rt=NGR[i]-i;
            long lt=i-NGL[i];
            long totalWays=rt*lt;
            long totalSum=totalWays*nums[i];
            ans+=totalSum;
        }
        return ans;
    }
    int[] getNSR(int[] nums){
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int[] ans=new int[n];
        for(int i=n-1;i>-1;i--){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return ans;
    }
    int[] getNSL(int[] nums){
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }
    
    int[] getNGR(int[] nums){
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int[]ans=new int[n];
        for(int i=n-1;i>-1;i--){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return ans;
    }
    int[] getNGL(int[] nums){
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }

    public long subArrayRanges1(int[] nums) {
        long range=0;
        for(int i=0;i<nums.length;i++){
            int min=nums[i];
            int max=nums[i];
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
                max=Math.max(max,nums[j]);
                range+=max-min;
            }
        }
        return range;
    }
}
