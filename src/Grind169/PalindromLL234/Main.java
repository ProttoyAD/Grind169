package Grind169.PalindromLL234;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        boolean palindrome=false;
        Stack<ListNode> nodes=new Stack<>();
        ListNode slow = head, fast = head;
        while (fast != null && fast.next !=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
//            System.out.println("Slow val: "+slow.val);
            System.out.println("Fast val: "+fast.val);
        }
        return palindrome;

    }
}
