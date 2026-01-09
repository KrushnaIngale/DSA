public class Reverse_LL_206 {
    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head=reverseList(head);
        for(ListNode temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.val+"-->");
        }
        System.out.println("null");
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
    static ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode node ;
        ListNode prev=null;
        while(temp!=null){
            node=temp;
            temp=temp.next;
            node.next=prev;
            prev=node;
        }
        return prev;
    }
}
