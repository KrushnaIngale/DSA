public class StackUsingLL {
    static class Stack{
        private class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node top=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=top;
            top=temp;
            size++;
        }
        int pop(){
            Node temp=top;
            top=top.next;
            temp.next=null;
            size--;
            return temp.data;
        }
        int top(){
            return top.data;
        }
        boolean isEmpty(){
            return top==null;
        }
        int size(){
            return size;
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
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
        
    }
}
