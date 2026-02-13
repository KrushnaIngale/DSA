import java.util.Stack;

public class SumOfSubarrayMin_907 {
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        SumOfSubarrayMin_907 s=new SumOfSubarrayMin_907();
        System.out.println(s.sumSubarrayMins(arr));
    }
    public int sumSubarrayMins(int[] arr) {
        int[] NSL=getNSL(arr,arr.length);
        int[] NSR=getNSR(arr,arr.length);
        long ans=0;
        int mod=(int)1e9+7;
        for(int i=0;i<arr.length;i++){
            long rt=NSR[i]-i;
            long lt=i-NSL[i];
            long totalWays=(lt*rt)%mod;
            long totalSum=totalWays*arr[i];
            ans=(ans+totalSum)%mod;
        }
        return (int)ans;
    }
    int[] getNSR(int[] arr,int n){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        for(int i=n-1;i>-1;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return ans;
    }
    int[] getNSL(int[] arr,int n){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }
}
