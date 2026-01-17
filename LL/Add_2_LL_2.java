public class Add_2_LL_2 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;

        }
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(9);
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);
        head1.next.next.next = new ListNode(9);
        Add_2_LL_2 obj = new Add_2_LL_2();
        head=obj.addTwoNumbers(head, head1);
        for(ListNode curr=head;curr!=null;curr=curr.next){
            System.out.print(curr.val+" ");
        }

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(-1);
        ListNode head=ans;
        int carry=0;
        while(l1!=null || l2!=null){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry = sum/10;
            ListNode temp=new ListNode(sum%10);
            ans.next=temp;
            ans=ans.next;
        }
        if(carry==1){
            ans.next=new ListNode(carry);
            ans=ans.next;
        }
        return head.next;
    }
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        
        ListNode temp=new ListNode(-1);
        ListNode dummy=temp;
        int carry=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val;
            sum=sum+carry;
            int rem=sum%10;
            
            if(sum<10){
                temp.next=new ListNode(sum);
            }else{
                temp.next=new ListNode(rem);
            }
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;
            temp=temp.next;
        }
        while(l1!=null){
            int sum=l1.val;
            sum=sum+carry;
            int rem=sum%10;
            if(sum<10){
                temp.next=new ListNode(sum);
            }else{
                temp.next=new ListNode(rem);
            }
            carry=sum/10;
            l1=l1.next;
            temp=temp.next;
        }
        while(l2!=null){
            int sum=l2.val;
            sum=sum+carry;
            int rem=sum%10;
            if(sum<10){
                temp.next=new ListNode(sum);
            }else{
                temp.next=new ListNode(rem);
            }
            carry=sum/10;
            l2=l2.next;
            temp=temp.next;
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
        }
        return dummy.next;
    }
}
