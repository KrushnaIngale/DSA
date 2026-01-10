public class Delete_DLL {
    static class ListNode{
        int data;
        ListNode next;
        ListNode prev;
        ListNode(int val){ this.data=val;}
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

        head=deleteHead(head);
        // head=deleteTail(head);

        // for(ListNode temp=head;temp!=null;temp=temp.next){
        //     System.out.print(temp.data+ " ");
        // }
        // System.out.println();
        // for(ListNode temp=head.next.next.next;temp!=null;temp=temp.prev){
        //     System.out.print(temp.data+ " ");
        // }


    }
    static ListNode deleteHead(ListNode head){
        if(head==null || head.next==null) return null;
        ListNode prev=head;
        head=head.next;
        head.prev=null;
        prev.next=null;
        return head;
    }
    static ListNode deleteTail(ListNode head){
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        ListNode prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        temp.prev=null;
        prev.next=null;
        return head;
    }
}
