/**
 * Definition for singly-linked list.
 **/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode curr = head;
        int len = 1;
        while(curr.next != null){
            len++;
            curr = curr.next;
        }
        curr.next = head;
        int x = k%len;
        for(int i = 0;i<len-x;i++){
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;

        return head;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}