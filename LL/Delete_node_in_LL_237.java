package LL;
public class Delete_node_in_LL_237{
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        Delete_node_in_LL_237 solution = new Delete_node_in_LL_237();
        solution.deleteNode(head.next);
        for (ListNode curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.val + " ");
        }

    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
