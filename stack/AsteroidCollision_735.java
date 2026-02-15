import java.util.Stack;

public class AsteroidCollision_735 {
    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        AsteroidCollision_735 sol = new AsteroidCollision_735();
        int[] result = sol.asteroidCollision(asteroids);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else{
                int abs=Math.abs(asteroids[i]);
                while(!st.isEmpty() && st.peek()<abs && st.peek()>0){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==abs && st.peek()>0){
                    st.pop();
                }else if(st.isEmpty() || st.peek()<0){
                    st.push(asteroids[i]);
                }
            }
        }  
        int[] ans=new int[st.size()];
        int i=st.size()-1;
        while(i!=-1){
            ans[i--]=st.pop();
        }      
        
        return ans;
    }
}
