public class Insert_DLL {
    static class ListNode{
        int data;
        ListNode next;
        ListNode prev;
        ListNode(int val){ this.data=val;}
        ListNode(int val,ListNode next){ this.data=val;this.next=next;}
        ListNode(int val,ListNode next,ListNode prev){ this.data=val;this.next=next;this.prev=prev;}
    }
    public static void main(String [] args){
        ListNode head=new ListNode(5);
        head.prev=null;
        head.next=new ListNode(2);
        head.next.prev=head;
        head.next.next=new ListNode(6);
        head.next.next.prev=head.next;
        head.next.next.next=new ListNode(9);
        head.next.next.next.prev=head.next.next;

        head=insertHead(head);
        head=insertTail(head);
        // head=insertKthElement(head,4);
        // head=insert(head,9);

        for(ListNode temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+ " ");
        }
        System.out.println();
        for(ListNode temp=head.next.next;temp!=null;temp=temp.prev){
            System.out.print(temp.data+ " ");
        }
    }
    static ListNode insetHead(ListNode head,int val){
        ListNode newNode =new ListNode(val,null,head);
        head.prev=newNode;
        head=newNode;
        return head;
    }
    static ListNode insertTail(ListNode head,int val){
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode newNode = new ListNode(val,null,temp);
        temp.next=newNode;
        return head;
    }
    static ListNode insertBeforeTail(ListNode head,int k,int val){
    }
}
