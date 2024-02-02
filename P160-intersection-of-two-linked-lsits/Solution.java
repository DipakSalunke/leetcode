public class Solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode l = new ListNode(4, new ListNode(1, listNode));
        ListNode m = new ListNode(5, new ListNode(6, new ListNode(1, listNode)));

        ListNode listNode1 = new ListNode(3);
        ListNode l1 = listNode1;
        ListNode m1 = new ListNode(2, listNode1);

        System.out.println(getIntersectionNode(l1, m1).val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pt1 = headA;
        ListNode pt2 = headB;
        while(pt1 != pt2){
            pt1=pt1.next;
            pt2=pt2.next;
            if(pt1==pt2)
                return pt1;
            if(pt1==null)
                pt1=headB;
            if(pt2==null)
                pt2=headA;
        }
        return pt1;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public ListNode(int x, ListNode listNode) {
            val = x;
            next = listNode;
        }
    }
}