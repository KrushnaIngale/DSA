public class Remove_nth_nodefrom_end_19 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = new ListNode(10);
        Remove_nth_nodefrom_end_19 obj = new Remove_nth_nodefrom_end_19();  
        for(ListNode curr=obj.removeNthFromEnd(head,2);curr!=null;curr=curr.next){ 
            System.out.print(curr.val+" ");
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return head;
    }
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int newCount=count-n;
        if(n==count){
            return head.next;
        }
        while(newCount!=1){
            temp=temp.next;
            newCount--;
        }
        temp.next=temp.next.next;
        return head;
    }
}
