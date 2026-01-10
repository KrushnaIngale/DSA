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

        // head=deleteHead(head);
        // head=deleteTail(head);
        // head=deleteKthElement(head,4);
        head=deleteNode(head,9);

        for(ListNode temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+ " ");
        }
        System.out.println();
        for(ListNode temp=head.next.next;temp!=null;temp=temp.prev){
            System.out.print(temp.data+ " ");
        }


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
    static ListNode deleteKthElement(ListNode head,int k){
        if(head==null || head.next==null) return null;
        if(k==1){
            head=deleteHead(head);
        }else{
            ListNode temp=head;
            ListNode prev=null;
            while(k!=1){
                temp=temp.next;
                prev=temp.prev;
                k--;
            }
            prev.next=temp.next;
            if(temp.next!=null)
                temp.next.prev=prev;
            temp.next=null;
            temp.prev=null;
        }
        return head;
    }
    static ListNode deleteNode(ListNode head,int node){
        if(head==null || head.next==null) return null;
        if (head.data == node) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null && temp.data!=node){
            temp=temp.next;
            prev=temp.prev;
        }
        if (temp == null) return head;

        prev.next=temp.next;
        if(temp.next!=null)
            temp.next.prev=prev;
        temp.next=null;
        temp.prev=null;

        return head;
    }
}
