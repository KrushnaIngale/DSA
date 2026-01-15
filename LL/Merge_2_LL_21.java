public class Merge_2_LL_21 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(9);
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);
        head1.next.next.next = new ListNode(9);
        Merge_2_LL_21 obj=new Merge_2_LL_21();
        for(ListNode curr=obj.mergeTwoLists(head,head1);curr!=null;curr=curr.next){
            System.out.print(curr.val+" ");
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(-1);
        ListNode dummy=temp;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                list2=list2.next;
            }
                temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }
        if(list2!=null){
            temp.next=list2;
        }
        return dummy.next;
    }
}
