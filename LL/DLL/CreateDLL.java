public class CreateDLL{
    public static void main(String[] args){
        int[] arr={5,3,6,9};
        node head=convertArrToDLL(arr);
        for(node curr=head;curr!=null;curr=curr.next){
            System.out.print(curr.data+"->");
        }
        System.out.println("null");
        System.out.println(head.next.next.next.back.data);
    }
    static class node{
        int data;
        node next;
        node back;
        node(int data){
            this.data=data;
            this.next=null;
            this.back=null;
        }
        node(int data,node next,node back){
            this.data=data;
            this.next=next;
            this.back=back;
        }
    }
    static node convertArrToDLL(int[]arr){
        node head=new node(arr[0]);
        node prev=head;
        for(int i=1;i<arr.length;i++){
            node temp=new node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

}