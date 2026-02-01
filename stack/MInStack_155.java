import java.util.Stack;

public class MInStack_155 {
    Stack<Integer> st1;
    Stack<Integer> st2;
    int min=Integer.MAX_VALUE;
    public MInStack_155() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
    
    public void push(int val) {
        min=Math.min(min,val);
        st1.push(val);
        if(st2.isEmpty()) st2.push(val);
        else st2.push(min);
    }
    
    public void pop() {
        st1.pop();
        st2.pop();
        min=st2.isEmpty()?Integer.MAX_VALUE:st2.peek();
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return st2.peek();
    }
    public static void main(String[] args) {
        MInStack_155 st=new MInStack_155();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.getMin());
        System.out.println(st.top());
        st.pop();
        System.out.println(st.getMin());
        System.out.println(st.top());
    }
}
