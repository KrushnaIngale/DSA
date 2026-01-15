import java.util.HashSet;
import java.util.Set;

public class Intersection_2LL_160 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {    
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode head1=new ListNode(6);
        head1.next=new ListNode(7);
        head1.next.next=new ListNode(8);
        head1.next.next.next=new ListNode(9);
        head1.next.next.next.next=new ListNode(10);
        head1.next.next.next.next.next=head.next.next;
        Intersection_2LL_160 obj=new Intersection_2LL_160();
        System.out.println(obj.getIntersectionNode(head,head1).val);
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode>set=new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
    
}
