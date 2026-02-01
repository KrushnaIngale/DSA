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
// --------------------------------------------------------------------------------
// class Pair{
//         int x,y;
//         Pair(int x,int y){
//             this.x=x;
//             this.y=y;
//         }
//     }
// class MinStack {
//     Stack<Pair> st;
    
//     public MinStack() {
//         st=new Stack<>();
//     }
    
//     public void push(int val) {
//         int min;
//         if(st.isEmpty()){
//             min=val;
//         }else{
//             min=Math.min(st.peek().y,val);
//         }
//         st.push(new Pair(val,min));
//     }
    
//     public void pop() {
//         st.pop();
//     }
    
//     public int top() {
//         return st.peek().x;
//     }
    
//     public int getMin() {
//         return st.peek().y;
//     }
// }

// --------------------------------------------------------------------------------------------------------
// class MinStack {
//     Stack<Long> st;
//     Long min;
//     public MinStack() {
//         st=new Stack<>();
//         min=Long.MAX_VALUE;
//     }
    
//     public void push(int value) {
//         Long val=Long.valueOf(value);
//         if(st.isEmpty()){
//             st.push(val);
//             min=val;
//         }else{
//             if(val<min){
//                 st.push(2*val-min);
//                 min=val;
//             }else{
//                 st.push(val);
//             }
//         }
//     }
    
//     public void pop() {
//         Long val=st.pop();
//         if(val<min){
//             min=2*min-val;
//         }
//     }
    
//     public int top() {
//         Long val=st.peek();
//         if(val<min){
//             return min.intValue();
//         }else{
//             return val.intValue();
//         }
//     }
    
//     public int getMin() {
//         return min.intValue();
//     }
// }

