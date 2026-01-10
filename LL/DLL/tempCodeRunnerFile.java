for(ListNode temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+ " ");
        }
        System.out.println();
        for(ListNode temp=head.next.next.next;temp!=null;temp=temp.prev){
            System.out.print(temp.data+ " ");
        }