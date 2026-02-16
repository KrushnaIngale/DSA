import java.util.Stack;

public class Maximal_Rectangle_85 {
    public static void main(String[] args) {
        char[][] matrix={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        Maximal_Rectangle_85 m=new Maximal_Rectangle_85();
        System.out.println(m.maximalRectangle(matrix));
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int maxArea=0;
        int[][] pSum=new int[n][m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=1;
                if(matrix[i][j]=='0') sum=0;
                pSum[i][j]=sum;
            }
        }
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,largestRectangleArea(pSum[i]));
        }
        return maxArea;
    }
    int largestRectangleArea(int[] nums){
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                int el=st.pop();
                int NSR=i;
                int NSL=st.isEmpty()?-1:st.peek();
                maxArea=Math.max(maxArea,nums[el]*(NSR-NSL-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int el=st.pop();
            int NSR=nums.length;
            int NSL=st.isEmpty()?-1:st.peek();
            maxArea=Math.max(maxArea,nums[el]*(NSR-NSL-1));
        }
        return maxArea;
    }
}
