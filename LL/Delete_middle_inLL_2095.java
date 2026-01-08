public class Delete_middle_inLL_2095 {
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
        // head.next.next.next.next = new ListNode(10);

        Delete_middle_inLL_2095 obj = new Delete_middle_inLL_2095();
        for(ListNode curr=obj.deleteMiddle(head);curr!=null;curr=curr.next){
            System.out.print(curr.val+" ");
        }
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null ||head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;

    }
    public ListNode deleteMiddle1(ListNode head) {
        if(head==null ||head.next==null){
            return null;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=(count/2)+1;
        temp=head;
        while(count!=2){
            count--;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;

    }
}
