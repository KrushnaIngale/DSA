public class MiddleofLL_876 {
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

        MiddleofLL_876 obj = new MiddleofLL_876();
        for(ListNode curr=obj.middleNode(head);curr!=null;curr=curr.next){
            System.out.print(curr.val+" ");
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp= head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count=(count/2)+1;
        while(count-1!=0){
            head=head.next;
            count--;
        }
        return head;
    }
}
