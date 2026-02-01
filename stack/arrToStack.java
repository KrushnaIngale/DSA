public class arrToStack {
    static class Stack{
        int[] st=new int[10];
        int top=-1;
        void push(int x){
            if(top+1>=st.length){
                System.out.println("error");  
                return;              
            }
            st[++top]=x;
        }
        int pop(){
            if(top==-1){
                System.out.println("error");
                return -1;
            }
            return st[top--];            
        }
        int top(){
            return st[top];
        }
        boolean isEmpty(){
            return top==-1;
        }
        boolean isFull(){
            return top==st.length-1;
        }
        int size(){
            return top+1;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.top());
         
        st.pop();
        st.size();
        st.isEmpty();
        st.isFull();
        st.pop();
        st.top();
        
    }
    
}
