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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        ListNode mid = slow;

        ListNode Curr = mid;
        ListNode prev = null;

        while(Curr!=null){
            ListNode ne = Curr.next;
            Curr.next = prev;
            prev = Curr;
            Curr = ne;
        }
            Curr = head;

        while(prev!=null){
            if(Curr.val != prev.val){
                return false;
            }else{
                Curr = Curr.next;
                prev = prev.next;
            }
        }
        return true;
        
    }
}