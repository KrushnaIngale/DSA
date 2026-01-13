import java.util.ArrayList;
import java.util.List;

public class Odd_Even_LL_328 {
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
        head.next.next.next.next = new ListNode(10);
        Odd_Even_LL_328 obj = new Odd_Even_LL_328();
        
        for(ListNode curr=obj.oddEvenList(head);curr!=null;curr=curr.next){
            System.out.print(curr.val+" ");
        }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode temp=even;
        while(even!=null&&even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;

            even.next=even.next.next;
            even=even.next;
        }
        odd.next=temp;
        return head;
    }

    public ListNode oddEvenList1(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode temp=head;
        int count=1;
        List<ListNode>even=new ArrayList<>();
        List<ListNode>odd=new ArrayList<>();
        while(temp!=null){
            if(count%2==1){
                odd.add(temp);
            }else{
                even.add(temp);
            }
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<odd.size();i++){
            temp.next=odd.get(i);
            temp=temp.next;
        }
        for(int i=0;i<even.size();i++){
            temp.next=even.get(i);
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}
