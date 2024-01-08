package Grind169.ReversedLL;

public class Main {
    public static void main(String[] args) {
        ListNode Node1=new ListNode(3);
        ListNode Node2=new ListNode(2,Node1);
        ListNode Node3=new ListNode(1,Node2);
        System.out.println(Node3.next.val);
        System.out.println(reverseList(Node3).next.val);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode previous=null;
        while (current !=null){
            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;

        }
        return previous;
    }





}
