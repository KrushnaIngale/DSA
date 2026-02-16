import java.util.Stack;

public class Largest_Rect_in_Histogram_84 {
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};
        Largest_Rect_in_Histogram_84 l=new Largest_Rect_in_Histogram_84();
        System.out.println(l.largestRectangleArea(heights));
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                int el=st.pop();
                int NSR=i;
                int NSL=st.isEmpty()?-1:st.peek();
                maxArea=Math.max(maxArea,heights[el]*(NSR-NSL-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int el=st.pop();
            int NSR=heights.length;
            int NSL=st.isEmpty()?-1:st.peek();
            maxArea=Math.max(maxArea,heights[el]*(NSR-NSL-1));
        }
        return maxArea;
    }
    public int largestRectangleArea1(int[] heights) {
        int[] NSR=getNSR(heights);
        int[] NSL=getNSL(heights);
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            maxArea=Math.max(maxArea,(NSR[i]-NSL[i]-1)*heights[i]);
        }
        return maxArea;
    }
    int[] getNSR(int[] nums){
        Stack<Integer>st=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>-1;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?nums.length:st.peek();
            st.push(i);
        }
        return ans;
    }
    int[] getNSL(int[] nums){
        Stack<Integer>st=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }
}
