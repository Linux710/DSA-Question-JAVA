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
    public ListNode partition(ListNode head, int x) {
        
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        
        ListNode left_trail = left;
        ListNode right_trail = right;
        
        while(head != null){
            if(head.val < x){
                left_trail.next = head;
                left_trail = left_trail.next;
            }
            else{
                right_trail.next = head;
                right_trail = right_trail.next;
            }
            head = head.next;
        }
        
        left_trail.next = right.next;
        right_trail.next = null;
      
        
        return left.next;
        
    }
}
