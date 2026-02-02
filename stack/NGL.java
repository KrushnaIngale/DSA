import java.util.Stack;
public class NGL {
    static int[] NGL(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>-1;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        NGL n=new NGL();
        int[] ans=n.NGL(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
