import java.util.HashMap;
import java.util.Stack;

public class NGL1_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st=new Stack<>();
        int[] ans1=new int[nums1.length];
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=nums2.length-1;i>-1;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                mpp.put(nums2[i],-1);
            }else{
                mpp.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            ans1[i]=mpp.get(nums1[i]);
        }
        return ans1;
    }
    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        NGL1_496 n=new NGL1_496();
        int[] ans=n.nextGreaterElement(nums1,nums2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        Stack<Integer>st=new Stack<>();
        int[] ans1=new int[nums1.length];
        int[] ans2=new int[nums2.length];
        for(int i=nums2.length-1;i>-1;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans2[i]=-1;
            }else{
                ans2[i]=st.peek();
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans1[i]=ans2[j];
                }
            }
        }
        return ans1;
    }
}
