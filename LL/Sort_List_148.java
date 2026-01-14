import java.util.ArrayList;

public class Sort_List_148 {
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

        Sort_List_148 obj = new Sort_List_148();
        for(ListNode curr=obj.sortList(head);curr!=null;curr=curr.next){
            System.out.print(curr.val+" ");
        }
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ArrayList<ListNode>ls=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ls.add(temp);
            temp=temp.next;
        }
        ls.sort((a,b)->Integer.compare(a.val, b.val));
        head=ls.get(0);
        temp=head;
        for(int i=1;i<ls.size();i++){
            temp.next=ls.get(i);
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}
