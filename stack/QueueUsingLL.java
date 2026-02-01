public class QueueUsingLL {
    static class Queue{
        private class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node start=null;
        Node end=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            if(start==null){
                start=temp;
                end=temp;
            }else{
                end.next=temp;
                end=temp;
            }
            size++;
        }
        int pop(){
            Node temp=start;
            start=start.next;
            temp.next=null;
            size--;
            return temp.data;
        }
        int top(){
            return start.data;
        }
        boolean isEmpty(){
            return start==null;
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.top());
        
    }
}
