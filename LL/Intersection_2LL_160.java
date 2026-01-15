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
    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode a=headA;
        ListNode b=headB;
        
        while(a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
            
        }
        return a;
    }
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode temp=headA;
        int lenA=0;
        int lenB=0;
        int diff=0;
        ListNode a=headA;
        ListNode b=headB;
        while(temp!=null){
            lenA++;
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            lenB++;
            temp=temp.next;
        }
        diff=Math.abs(lenA-lenB);

        if(lenA>lenB){
            while(diff-->0){
                a=a.next;
            }
        }else{
            while(diff-->0){
                b=b.next;
            }
        }

        while(a!=null && b!=null){
            if(a==b){
                return a;
            }
            a=a.next;
            b=b.next;
            
        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode temp=headA;
        int count1=0;
        int count2=0;
        int count3=0;
        while(temp!=null){
            count1++;
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            count2++;
            temp=temp.next;
        }
        count3=Math.abs(count1-count2);
        if(count1>count2){
            temp=headA;
            while(count3!=0){
                temp=temp.next;
                count3--;
            }
        }else if(count2>count1){
            temp=headB;
            while(count3!=0){
                temp=temp.next;
                count3--;
            }
        }else{
            while(headA!=null){
                if(headA==headB) return headA;
                headA=headA.next;
                headB=headB.next;
            }
        }

        while(temp!=null && headA!=null && headB!=null){
            if(count1>count2){
                if(temp==headB){
                    return temp;
                }
                headB=headB.next;
            }else if(count1<count2){
                if(temp==headA){
                    return temp;
                }
                headA=headA.next;
            }
            temp=temp.next;
        }
        return null;
    }
    
}
