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

        // head=insertHead(head,0);
        // head=insertTail(head,4);
        // head=insertBeforeTail(head,37);
        head=insertKthElement(head,37,5);
        // head=insert(head,9);

        for(ListNode temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+ " ");
        }
        System.out.println();
        for(ListNode temp=head.next.next.next.next;temp!=null;temp=temp.prev){
            System.out.print(temp.data+ " ");
        }
    }
    static ListNode insertHead(ListNode head,int val){
        ListNode newNode =new ListNode(val,head,null);
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
    static ListNode insertBeforeTail(ListNode head,int val){
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode prev=temp.prev;
        ListNode newNode = new ListNode(val,temp,prev);
        prev.next=newNode;
        temp.prev=newNode;
        return head;
    }
    static ListNode insertKthElement(ListNode head,int val,int k){
        if(k==1) return insertHead(head,val);
        ListNode temp=head;
        while(k!=2 && temp!=null){
            temp=temp.next;
            k--;
        }
        if(temp.next==null) return insertTail(head,val);

        ListNode newNode=new ListNode(val,temp.next,temp);
        temp.next.prev=newNode;
        temp.next=newNode;
        
        return head;
    }
    static ListNode insert(ListNode head,int val){
        return head;
    }
}
