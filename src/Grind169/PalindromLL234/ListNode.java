package Grind169.PalindromLL234;

public class ListNode {
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
    ListNode next;
    public ListNode(){

    }
    public ListNode(int val){
        this.val=val;
    }
    public ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }

}