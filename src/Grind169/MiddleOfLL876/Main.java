package Grind169.MiddleOfLL876;


public class Main {
    public static void main(String[] args) {
        Node Node1=new Node(9);
        Node Node2=new Node(8,Node1);
        Node Node3=new Node(7,Node2);
        Node Node4=new Node(6,Node3);
        Node Node5=new Node(5,Node4);
        Node Node6=new Node(4,Node5);
        Node Node7=new Node(3,Node6);
        Node Node8=new Node(2,Node7);
        Node Node9=new Node(1,Node8);
        System.out.println(middleNodeLeet(Node6));

    }
    public static Node middleNode(Node head) {
        int counter=1;
        Node temp=head;
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

    public static Node middleNodeLeet(Node head) {
        Node slow = head, fast = head;
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
