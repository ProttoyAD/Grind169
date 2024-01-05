package Grind75.MergeTwoSortedArrays;

public class MergeTwo {
    public static void main(String[] args) {
        ListNode Node1=new ListNode(5);
        ListNode Node2=new ListNode(4,Node1);
        ListNode Node3=new ListNode(1,Node2);

        ListNode Node4=new ListNode(3);
        ListNode Node5=new ListNode(3,Node4);
        ListNode Node6=new ListNode(2,Node5);



        System.out.println(mergeTwoLists(Node3,Node6).next.next.next.val);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode();

        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                result.val = list1.val;
                list1 = list1.next;
                result.next=mergeTwoLists(list1,list2);
            } else {
                result.val = list2.val;
                list2 = list2.next;
                result.next=mergeTwoLists(list1,list2);
            }

        }
        else {
            if (list1==null){
                result=list2;
            }
            else {
                result=list1;
            }

        }

        return result;
    }
}
