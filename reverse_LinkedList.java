public class reverse_LinkedList {
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
class Solution {
    public ListNode reverseList(ListNode head) {
        // Iterate
        // if(head == null || head.next == null){
        //     return head;
        // }
        // ListNode pre = null;
        // ListNode curr = head;
        // while(curr != null){
        //     ListNode nextNode = curr.next;
        //     curr.next = pre;
        //     pre = curr;
        //     curr = nextNode;
        // }
        // head = pre;
        // return pre;
        
        //  Recursion
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
}
