import java.util.HashSet;

public class LL_Cycle_141 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = head.next.next;

        LL_Cycle_141 obj = new LL_Cycle_141();
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }

    public static boolean hasCycle1(ListNode head) {
        HashSet<ListNode> mpp = new HashSet<>();
        ListNode temp = head;
        while (temp != null) {
            if (mpp.contains(temp))
                return true;
            mpp.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
