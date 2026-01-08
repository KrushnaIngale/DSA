public class Delete{
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
        Delete solution = new Delete();
        ListNode newhead;
        // newhead=solution.deleteNodeStart(head);
        // System.out.println();
        // newhead=solution.deleteNodeEnd(head);
        System.out.println();
        newhead=solution.deleteNode(head,2);

    }
    public ListNode deleteNodeStart(ListNode head) {
        ListNode temp=head;
        head=head.next;
        for (ListNode curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.val + " ");
        }
        return head;
    }
    ListNode deleteNodeEnd(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp =head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        for (ListNode curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.val + " ");
        }
        return head;
    }
    ListNode deleteNode(ListNode head,int k) {
        if(head==null || head.next==null){
            return null;
        }
        if(k==1){
            head=head.next;
            for (ListNode curr = head; curr != null; curr = curr.next) {
                System.out.print(curr.val + " ");
            }
            return head;
        }
        ListNode temp = head;
        int count=1;
        while(temp!=null){
            if(count==k-1){
                temp.next=temp.next.next;
                break;
            }
            count++;
            temp=temp.next;
        }
        for (ListNode curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.val + " ");
        }
        return head;
    }
}