package Grind169.MiddleOfLL876;


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
        System.out.println(middleNodeLeet(Node6));

    }
    public static ListNode middleNode(ListNode head) {
        int counter=1;
        ListNode temp=head;
        if (head==null){
            return null;
        }
        while (head.next!=null){
            counter++;
            head=head.next;
        }


        for (int i=0;i<(counter/2);i++){
            temp=temp.next;
        }
        return temp;
    }

    public static ListNode middleNodeLeet(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next !=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
//            System.out.println("Slow val: "+slow.val);
            System.out.println("Fast val: "+fast.val);
        }
        System.out.println(slow.val);
        return slow;
    }

//    While slow moves one step forward, fast moves two steps forward.
//    Finally, when fast reaches the end, slow happens to be in the middle of the linked list.


}
