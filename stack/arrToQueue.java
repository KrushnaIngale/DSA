public class arrToQueue {
    static class Queue{
        int[] q=new int[4];
        int start=-1;
        int end=-1;
        int currSize=0;

        void push(int x){
            if(currSize>=q.length){
                System.out.println("error");
                return;            
            }
            if(start==-1){
                start=0;
                end=0;
            }else{
                end=(end+1)%q.length;
            }
            q[end]=x;
            currSize++;
        }
        int pop(){
            if(start==-1){
                System.out.println("error");
                return -1;
            }
            int el=q[start];
            if(currSize==1){
                start=-1;
                end=-1;
                currSize-=1;
            }else{
                start=(start+1)%q.length;
                currSize--;
            }
            return el;
        }
        int top(){
            if(start==-1){
                System.out.println("error");
                return -1;
            }
            return q[start];
        }
        boolean isEmpty(){
            return currSize==0;

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
        
    }
}
