package Grind169.MiddleOfLL876;


public class Main {
    public static void main(String[] args) {
        ListNode Node4=new ListNode(4);
        ListNode Node5=new ListNode(3,Node4);
        ListNode Node6=new ListNode(2,Node5);
        ListNode Node7=new ListNode(1,Node6);
        System.out.println(middleNode(Node7).val);

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
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

//    While slow moves one step forward, fast moves two steps forward.
//    Finally, when fast reaches the end, slow happens to be in the middle of the linked list.


}
