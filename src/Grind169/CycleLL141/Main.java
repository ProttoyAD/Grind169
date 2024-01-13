package Grind169.CycleLL141;



public class Main {
    public static void main(String[] args) {
        ListNode Node4=new ListNode(4);
        ListNode Node5=new ListNode(3);
        ListNode Node6=new ListNode(2);
        Node6.next=Node5;
        Node5.next=Node4;
        Node4.next=Node6;
        ListNode Node7=new ListNode(1,Node6);
        System.out.println(hasCycle(Node7));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode tail=head;
        boolean result=false;
        if (head==null){
            return false;
        }
        while (head.next!=null && tail.next!=null && tail.next.next!=null){

            head=head.next;
            tail=tail.next.next;
            if (head==tail){
                return true;
            }
        }
        return result;
    }


    public boolean hasCycleGPT(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (tortoise == hare) {
                return true;  // Cycle detected
            }
        }

        return false;  // No cycle found
    }




}
