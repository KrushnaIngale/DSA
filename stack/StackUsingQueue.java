import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue {
    static class Stack{
        Queue<Integer> q=new LinkedList<>();
        void push(int x){
            q.add(x);
            int n=q.size();
            for(int i=0;i<n;i++){
                q.add(q.remove());
            }
        }
        int pop(){
            return q.remove();
        }
        int top(){
            return q.peek();
        }
        boolean isEmpty(){
            return q.isEmpty();
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println();
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
        
    }
}
