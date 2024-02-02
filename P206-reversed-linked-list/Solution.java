class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode front = temp.next;
            // Reverse the direction of the
            // current node's 'next' pointer
            // to point to 'prev'
            temp.next = prev;
            // Move 'prev' to the current
            // node for the next iteration
            prev = temp;
            // Move 'temp' to the 'front' node
            // advancing the traversal
            temp = front;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}