import java.util.Stack;public class QueueUsingStack {
    static class Queue{
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        void push(int x){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        int pop(){
            return s1.pop();
        }
        int top(){
            return s1.peek();
        }
        boolean isEmpty(){
            return s1.isEmpty();
        }
    }
    public static void main(String[] args) {    
        Queue q=new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.top());
        
    }
}
