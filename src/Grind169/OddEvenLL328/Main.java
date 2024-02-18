package Grind169.OddEvenLL328;


public class Main {
    public static void main(String[] args) {
        ListNode Node1=new ListNode(9);
        ListNode Node2=new ListNode(8,Node1);
        ListNode Node3=new ListNode(7,Node2);
        ListNode Node4=new ListNode(6,Node3);
        ListNode Node5=new ListNode(5,Node4);
        ListNode Node6=new ListNode(4,Node5);
        ListNode Node7=new ListNode(3,Node6);
        ListNode Node8=new ListNode(2,Node7);
        ListNode Node9=new ListNode(1,Node8);
        oddEvenList(Node9);
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        ListNode temp=head;
        ListNode curr=temp;
        while (head!= null && head.next != null) {
            ListNode tem1=head.next;
            ListNode tem2=head.next.next;
            curr.next=tem1;
            curr.next.next=head;
            tem2.next=tem2;
            head=head.next;
        }
        return temp;
    }
}
