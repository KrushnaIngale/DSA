public class Palindrome_LL_234 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(4);
        System.out.println(isPalindrome(head));
        System.out.println("-------------end-------------");
        
    }
    static boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null)  prev.next=null;
        
        ListNode curr=slow;
        ListNode next=slow;
        ListNode prev1=null;
        while(curr!=null){
            next=next.next;
            curr.next=prev1;
            prev1=curr;
            curr=next;            
        }
        ListNode newHead=prev1;

        while(head!=null && newHead!=null){
            if(head.val!=newHead.val){
                return false;
            }
            head=head.next;
            newHead=newHead.next;
        }
        return true;
    }
}
