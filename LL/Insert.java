public class Insert {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        head=insertStart(head, 37);
        printList(head);
        head=insertEnd(head, 50);
        printList(head);
        head=insertAtK(head,33,4);
        printList(head);
        head=insertBeforeVal(head, 3, 30);
        printList(head);
    }

    static Node insertStart(Node head, int data) {
        Node newNode=new Node(data,head);
        head=newNode;   
        return head;
    }
    static Node insertEnd(Node head, int data) {
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next; 
        }
        Node newNode=new Node(data);
        temp.next=newNode;
        return head;
    }
    static Node insertAtK(Node head,int data,int k){
        if(k==1){
            Node newNode=new Node(data,head);
            head=newNode;
            return head;
        }
        Node temp=head;
        int count=1;
        while(count!=k-1){
            temp=temp.next;
            count++;
        }
        Node newNode=new Node(data,temp.next);
        temp.next=newNode;
        return head;
    }
    static Node insertBeforeVal(Node head,int el,int val){
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            if(temp.data==val){
                break;
            }else{
                prev=temp;
                temp=temp.next;
            }
        }
        Node newNode=new Node(el,temp);
        prev.next=newNode;
        
        return head;
    }
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

}
