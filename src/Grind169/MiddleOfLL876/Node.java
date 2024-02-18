package Grind169.MiddleOfLL876;

public class Node {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    int val;
    Node next;
    public Node(){

    }
    public Node(int val){
        this.val=val;
    }
    public Node(int val, Node next){
        this.val=val;
        this.next=next;
    }

}